public class RoundRobinScheduler extends Scheduler{

    public RoundRobinScheduler(int numProcessors) {
        super(numProcessors);
    }

    public void run() {
        System.out.println("Running Round Robin scheduler...");

        // Fire up the Task Generator
        TaskGenerator tg = new TaskGenerator(numTasks, 1, this);
        Thread generatorThread = new Thread(tg);
        generatorThread.start();
        while(tasks.isEmpty()) {
            // Wait for the Task Generator to start
        }

        // Assign Tasks to available Processors until there are no Tasks left
        while(generatorThread.isAlive() || !tasks.isEmpty()) {
            try {
                //printTasksRemaining();

                // Increment the Last Assigned Processor Index
                lapi = ++lapi % processors.length;

                // Wait for the processor to become available
                while(processors[lapi].hasTask()) {
                    Thread.sleep(1);
                }

                // Assign the next task to the processor and run it
                //System.out.println("Task:"+tasks.get(0)+" assigned to Processor:"+lapi);
                processors[lapi].setTask(tasks.remove(0));
                Thread.sleep(1);
                Thread t = new Thread(processors[lapi]);
                t.start();
            } catch (InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }

        // Wait for all Tasks to finish
        for(Processor p: processors) {
            while(p.hasTask()) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        }

        System.out.println("Round Robin Scheduler Complete! Time Elapsed = "+getTimeElapsed()+"ms");
    }
}
