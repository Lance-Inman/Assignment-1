import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("Assignment-1.csv"));
        pw.println("Round Robin, Shortest First");
        for(int x = 0; x < 100; x++) {
            System.out.println("Runs remaining:"+x);
            RoundRobinScheduler rrs = new RoundRobinScheduler(3);
            rrs.run();
            pw.print(rrs.getTimeElapsed()+", ");
            pw.flush();
            ShortestFirstScheduler sfs = new ShortestFirstScheduler(3);
            sfs.run();
            pw.println(sfs.getTimeElapsed());
            pw.flush();
        }
        pw.close();
    }
}
