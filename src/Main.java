public class Main {

    public static void main(String[] args) {
        RoundRobinScheduler rrs = new RoundRobinScheduler(3);
        Thread schedulerThread = new Thread(rrs);
        schedulerThread.start();
    }
}
