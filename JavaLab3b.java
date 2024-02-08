import java.util.Scanner;

public class JavaLab3b {
    public static void main(String[] args){

//  1. write a program where a given integer is identified as "positive", "negative" , or "zero"

        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("1.) Enter a whole number: ");
        number = input.nextInt();

        if(number > 0) {
            System.out.println("Your number is POSITIVE!");
        } else if (number < 0) {
            System.out.println("Your number is NEGATIVE!");
        } else {
            System.out.println("Your number is 0!");
        }
        System.out.println();

//  2. write a program where when two integers are given the smaller number is identified

        Scanner input1 = new Scanner(System.in);
        int numA;
        Scanner input2 = new Scanner(System.in);
        int numB;

        System.out.println("2.) Enter a whole number: ");
        numA = input1.nextInt();
        System.out.println("Enter a whole number: ");
        numB = input2.nextInt();

        if(numA > numB) {
            System.out.println("The smaller number is " + numB);
        } else {
            System.out.println("The smaller number is " + numA);
        }
        System.out.println();



//  3. write a program to identify if a four digit year is a leap year

        Scanner input3 = new Scanner(System.in);
        int year;

        System.out.println("3.) Enter a year: ");
        year = input3.nextInt();

        if(year % 4 == 0) {
            System.out.println( year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }


}
