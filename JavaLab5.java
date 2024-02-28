import java.util.Scanner;

public class JavaLab5 {
    public static void main(String[] args) {
//  1.)
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1.) Enter a number: ");
        int num1 = scanner1.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scanner1.nextInt();
        max(num1,num2);
//  2.)
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("2.) Enter a number to get its factorial: ");
        int posNum = scanner2.nextInt();
        factorial(posNum);
//  3.)
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("3.) Enter a number to determine if it is even: ");
        int num = scanner3.nextInt();
        System.out.println(isEven(num));
//  4.)
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("4.) Enter a number: ");
        int num4 = scanner4.nextInt();
        System.out.println("Enter a character: ");
        char letter = scanner4.next().charAt(0);
        printChar(num4, letter);
        System.out.println();

//  5.)
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("5.) Type some words: ");
        String words = scanner5.nextLine();
        print(words);
//  6.)
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("6.) Enter a number: ");
        int numA = scanner6.nextInt();
        System.out.println("Enter a number: ");
        int numB = scanner6.nextInt();
        System.out.println("Enter a number: ");
        int numC = scanner6.nextInt();
        System.out.println(max(numA,numB,numC) + " is the largest number.");



    }
// Methods -------------------------------------------------------------------------------------------------------------
//        1. write a method "max" which takes two integers and return the larger of the two integers

                public static void max(int num1, int num2) {
                    if(num1 > num2) {
                        System.out.println(num1 + " is larger.");
                    } else {
                        System.out.println(num2 + " is larger.");
                    }
                }


//        2. write a method "factorial" which takes a positive integer larger than zero and return the factorial of that number

                public static void factorial(int posNum){
                    long fact = 1;

                    for (int i = 1; i <= posNum; i++) {

                        fact = fact * i;
                    }
                    System.out.println("The factorial of " + posNum + " is " + fact + ".");

                }
//        3. write a method "isEven" which takes an integer as input and return a Boolean true or false

                public static boolean isEven(int num){
                    if(num % 2 == 0){
                        return true;
                    } else {
                        return false;
                    }
                }
//        4. write a method "printChar" which takes a character and an integer and display on screen (println) the character the number of times indicated by the input
                public static void printChar(int num, char letter){
                    for (int i = 0; i < num; i++) {
                        System.out.print(letter);
                    }
                }

//        5. write a method "print" which will take a string and display on to screen (no return)

                public static void print(String words){
                    System.out.println(words);
                }
//        6 write a method "max" that would take three integers and return the largest value

                public static int max(int numA, int numB, int numC) {
                    if (numA > numB && numA > numC) {
                        return numA;

                    } else if (numB > numA && numB > numC) {
                        return numB;
                    } else return numC;

                }
}