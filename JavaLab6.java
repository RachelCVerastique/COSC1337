import java.util.Scanner;

public class JavaLab6 {
    public static void main(String[] args) {
//  1.)
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.) Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter another number: ");
        int num2 = scanner.nextInt();
        System.out.println(multiple(num,num2));
//  2.)
        int number1;
        int number2;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("2.) Enter a number: ");
        number1 = scanner2.nextInt();
        System.out.println("Enter another number: ");
        number2 = scanner2.nextInt();
        lcd(number1, number2);

//  3.)
        int num1;
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("3.) Enter a number: ");
        num1 = scanner3.nextInt();
        System.out.println(palindrome(num1));


//  4.)
        char print = 'x';
        matrix(print);

    }

//        1. Write a method multiple that determines, for a pair of integers, whether the second integer is a multiple of the first.
//        The method should take two integer arguments, return true if the second is a multiple of the first, and return false otherwise.
            public static boolean multiple(int num, int num2){
                if(num % num2 == 0){
                    return true;
                } else {
                    return false;
                }
            }


//          2. Write a method LCD that returns the least common divisor of two integers (the number that evenly divides both).
//          This method should take two integer arguments, and return the LCD of those numbers.

                public static void lcd(int number1, int number2) {
                    int lcd = Math.max(number1, number2);
                    while (true) {
                        if (lcd % number1 == 0 && lcd % number2 == 0) {
                            System.out.println(lcd);
                            break;
                        }
                        ++lcd;
                    }

                }


//          3. A non-negative integer is called a palindrome if it reads forward and backward in the same way. For example, the numbers 5, 121, 3443, and 123454321 are palindromes.
//          Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; otherwise, it returns false.

                 public static boolean palindrome(int num1){
                     int oNum = num1;
                     int revNum = 0;
                     while (num1 != 0){
                        revNum = revNum * 10 + num1 % 10;
                        num1 = num1 / 10;

                     }
                     if (oNum == revNum){
                         return true;
                     }else{
                         return false;
                     }
                 }


//          4. Write a method that draws a matrix of 3 by 4 (3 rows of 4 columns) with x as the element. Hint: Use two for loops

                 public static void matrix(char print)
                 {
                     int r = 3;
                     int c = 4;
                     for (int i = 0; i < r; i++)
                     {

                         for (int j = 0; j < c; j++)
                         {
                             System.out.print( print  + "\t");
                         }
                         System.out.println();
                     }
                 }

}

