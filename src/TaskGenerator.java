import java.util.Random;

public class TaskGenerator implements Runnable {
    private int numTasks;
    private int interval;
    private Scheduler s;

    public TaskGenerator(int numTasks, int interval, Scheduler s) {
        this.numTasks = numTasks;
        this.interval = interval;
        this.s = s;
    }

    public void run() {
        int arrivalTime = 0;
        System.out.println("Generating random tasks");
        Random rnd = new Random();
        for(int i = 0; i < numTasks; i++) {
            Task t = new Task(arrivalTime++, rnd.nextInt(s.getMaxTaskTime())+1);
            s.addTask(t);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
        System.out.println("Done generating tasks");
    }
}
