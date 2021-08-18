import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Prime Number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        PrimeNumber.perfectNum(num);
    }

    public static void perfectNum(int n){
        boolean flag=false;
        int i;
        int a=n/2;

        if(n==0 || n==1){
            System.out.println("It is not a Prime Number");
        }
        else{
            for( i=2; i<=a; i++){
                int value=n % i;
                if(value==0) {

                    System.out.println(" Its not a Prime Number");
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.println(n+" is a Prime Number!!!!");
            }
        }
    }
}