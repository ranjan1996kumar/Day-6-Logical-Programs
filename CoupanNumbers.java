import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class CoupanNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = scan.nextInt();

        randomCoupon(number);
    }

    static void randomCoupon(int number) {
        int[] table =  new int[number];
        for (int i = 0; i < number; i++) {
            int couponNumbers = (int) ThreadLocalRandom.current().nextInt(1000,9999);
            table[i] = couponNumbers;
            System.out.println(table[i]);
        }
        int len = table.length;
        unique(table, len);
    }
    public static void unique(int[] table, int len) {
        int check =0;
        for (int j = 0; j < len; j++) {
            int firstNumber=table[j];
            for (int k = j+1; k < len; k++) {
                int secondNumber = table[k];
                if (firstNumber==secondNumber) {
                    check =1;
                }
            }
        }
        if (check==1){
            System.out.println("The coupons are not Same");
        }
        else System.out.println("The coupons are Same");
    }

}
