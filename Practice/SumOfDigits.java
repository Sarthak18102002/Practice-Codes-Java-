package Practice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
try {
    System.out.print("Enter a long integer: ");
    long no = sc.nextInt();
    long sum = 0;

    while (no > 0) {
        sum = sum + no % 10;
        no = no / 10;
    }

    System.out.println("Sum of digits: " + sum);
}
        catch(Exception e)
         {
         System.out.println(" Invalid Input ");
       }
    }
}