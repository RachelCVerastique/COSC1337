import java.util.Scanner;

public class JavaLab4 {
    public static void main(String[] args){

//  1. write a java code that would display a given character 10 times

        Scanner input = new Scanner(System.in);
        char letter;

        System.out.println("1.) Enter a letter: ");
        letter = input.next().charAt(0);

        for (int i = 0; i < 10; i++) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.println();


//  2. write a for loop that would calcualte the factorial of 7

        int num = 7;
        long fact = 1;

        for (int i = 1; i <= num; i++) {

            fact = fact * i;
        }
        System.out.println("2.) The factorial of 7 is " + fact + ".");
        System.out.println();


//  3. write a while loop that would display the integers between 1 and 25. (Hint: start with int x equal to 1, while x is less than or equal to 26)//

        int num1 = 1;
        System.out.print("3.) ");
        while(num1 <= 26){
            System.out.print(num1 + ", ");
            num1++;
        }
        System.out.println();
        System.out.println();


//  4. write a while loop that would test if a given integer is a primitive (Hint: a number 'a' divisible by 'b' will have a%b equal to zero)

        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number to determine if it is a Prime number or Not: ");
        int myNum = numInput.nextInt();

        int i = 2;
        int count = 0;

        while (i <= myNum / 2){

            if(myNum % i == 0){
                count++;
                break;
            }
            i++;

        }
        if (count == 0) {
            System.out.println(myNum + " is prime number");
        } else {
            System.out.println(myNum + " is not a prime number");
        }

    }


}
