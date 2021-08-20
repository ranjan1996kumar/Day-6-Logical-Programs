import java.util.Scanner;

public class SimulateStopwatch {
    public static void main(String[] args) {
        System.out.println("Press key to start stopwatch");

        double start = System.currentTimeMillis();


        startStopwatch();
        double end = System.currentTimeMillis();
        System.out.println("Time: "+(end-start)+" ms");
    }


    static void startStopwatch(){
        Scanner scan = new Scanner(System.in);
        char a= scan.next().charAt(0);
        System.out.println("Press key to stop stopwatch");
        char b= scan.next().charAt(0);
    }
}
