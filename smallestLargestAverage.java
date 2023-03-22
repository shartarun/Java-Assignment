import java.util.Scanner;

import javax.swing.text.Document;

public class smallestLargestAverage {
    public static void main(String[] args) {
        int smallest, largest, average;
        Scanner num1 = new Scanner(System.in);
        System.out.println("enter a first number");
        int numFirst = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("enter a second number");
        int numSecond = num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.println("enter a third number");
        int numThird = num3.nextInt();
        // check and print the largest number and store in largest variable
        if (numFirst > numSecond) {
            if (numFirst > numThird) {
                System.out.println("Largest Number is:" + numFirst + " First");
                largest = numFirst;
            } else {
                System.out.println("largest Number is:" + numThird + " Third");
                largest = numThird;
            }

        } else if (numSecond > numThird) {
            System.out.println("largest Number is:" + numSecond + " Second");
            largest = numSecond;
        } else {
            System.out.println("largest Number is:" + numThird + " Third");
            largest = numThird;
        }
        // check and print smallest number and store in smallest variable
        if (numFirst < numSecond) {
            if (numFirst < numThird) {
                System.out.println("Smallest Number is:" + numFirst + " First");
                smallest = numFirst;
            } else {
                System.out.println("Smallest Number is:" + numThird + " Third");
                smallest = numThird;
            }

        } else if (numSecond < numThird) {
            System.out.println("Smallest Number is:" + numSecond + " Second");
            smallest = numSecond;
        } else {
            System.out.println("Smallest Number is:" + numThird + " Third");
            smallest = numThird;
        }
        // calculate average number from largest - smallest
        average = largest - smallest;
        System.out.println("average number is:" + average);

    }
}
