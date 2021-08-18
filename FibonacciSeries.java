import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("Fibonacci Series");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num");
        int num=scan.nextInt();
        FibonacciSeries.fSeries(num);
    }

    public static void fSeries(int n){
        int sum=0;
        for(int i=0; i<n; i++){
            System.out.println(i);
            sum+=i;
            System.out.println(sum);
        }
    }
}