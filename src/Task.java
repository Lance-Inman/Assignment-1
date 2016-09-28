public class Task {
    private long arrivalTime;
    private int processingTime;

    public Task(long arrivalTime, int processingTime) {
        this.arrivalTime = arrivalTime;
        this.processingTime = processingTime;
    }

    public long getArrivalTime() {
        return arrivalTime;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public String toString() {
        return "["+arrivalTime+","+processingTime+"]";
    }
}
