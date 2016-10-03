import java.util.ArrayList;

public abstract class Scheduler implements Runnable{
    protected Processor[] processors;
    protected int lapi; // Last Assigned Processor Index
    protected ArrayList<Task> tasks;
    protected final int numTasks = 1000;
    private final int maxTaskTime = 500;
    private long startTime;

    public Scheduler(int numProcessors) {
        processors = new Processor[numProcessors];
        for(int i = 0; i < numProcessors; i++) {
            Processor p = new Processor();
            processors[i] = p;
        }
        tasks = new ArrayList<>();
        startTime = System.currentTimeMillis();
        lapi = -1;
    }

    public int getMaxTaskTime() {
        return maxTaskTime;
    }

    public void addTask(Task t) {
        tasks.add(t);
    }

    public long getTimeElapsed() {
        return System.currentTimeMillis() - startTime;
    }

    public void printTasksRemaining() {
        int digitsToDelete = String.valueOf(tasks.size()+1).length();
        for(int i = 0; i < digitsToDelete; i++) {
            System.out.print("\b");
        }
        System.out.print(tasks.size());
    }
}
