import java.util.Scanner;
public class ReverseNumber {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        //user i/p value of No to be reversed
        System.out.println("Enter a Number");
        int number = scan.nextInt();
        //user input to ReverseNo function
        ReverseNo(number);
    }
    static void ReverseNo(int number) {
        int reverse = 0, remainder =0;
        while(number>0){
            remainder = number%10;
            reverse= reverse*10+remainder;
            number = number/10;
        }
        System.out.println("Reverse of the entered number is:"+reverse);
    }
}