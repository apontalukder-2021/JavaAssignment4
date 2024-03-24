import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                double num1, num2, num3;
                double largest;
                System.out.printf("Enter the first number: ");
                num1 = in.nextDouble();
                System.out.printf("Enter the second number: ");
                num2 = in.nextDouble();
                System.out.printf("Enter the third number: ");
                num3 = in.nextDouble();
                if (num1 > num2 && num1 > num3) {
                    largest = num1;
                } else if (num2 > num1 && num2 > num3) {
                    largest = num2;
                } else {
                    largest = num3;
                }
                System.out.printf("The largest number is: %.2f", largest);


    }
    }