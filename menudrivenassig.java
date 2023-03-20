import java.util.Scanner;

public class menudrivenassig {
    public static void main(String[] args) {
        int i;
        System.out.println("Even/Odd Checker");

        while (true) {
            Scanner ask = new Scanner(System.in);
            System.out.println("do you want to check 1/0");
            int value = ask.nextInt();

            if (value == 1) {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number:");
                int a = input.nextInt();
                if (a % 2 == 0) {
                    System.out.println("Even Number");
                    break;

                } else {
                    System.out.println("Odd Number");
                }

            } else {
                System.out.println("out from loop");
            }
        }
    }
}
