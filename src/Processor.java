public class Processor implements Runnable{
    private Task currentTask;

    public void run() {
        System.out.println("Task:"+currentTask+" started");
        try {
            // Wait to simulate processing the job
            Thread.sleep(currentTask.getProcessingTime());
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        } catch (NullPointerException npe) {
            System.out.println("No Task assigned");
        }
        System.out.println("Task:"+currentTask+" completed");
        currentTask = null;
    }

    public void setTask(Task t) {
        currentTask = t;
    }

    public boolean hasTask() {
        return currentTask != null;
    }

    public Task getTask() {
        return currentTask;
    }
}
