import java.util.Arrays;
import java.util.Scanner;
import static java.util.Arrays.binarySearch;

public class Lab11 {
    public static void main(String[] args) {
//        1. Create an integer array "test" with elements 1, 2, 3, 4, and 5.
//        Display each element of this array, one value per line.
//                Make a copy of the array as "copy".
//                Find the outcome of copy[5]


    int[] test = {1, 2, 3, 4, 5};
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        int[] copy = Arrays.copyOf(test, 5);
        System.out.println(Arrays.toString(copy));

        System.out.println();



//        2. Create an integer array "a" with elements 3, 8, 1, 9, 12, 15, 2, 25.
//        Find the minimum element of the array and display the index (hint: use a for-loop)
//        Find the maximum element of the array and display the index (hint: use a for-loop)


        int[] a = {3, 8, 1, 9, 12, 15, 2, 25};

        int max = a[0];
        int min = a[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
            if (a[i] < min) {
                min = a[i];
                minIndex = i;
                {

                }}

        }
        System.out.println("The max element in the 'a' array is " + max + ".");
        System.out.println("The index of " + max + " is " + maxIndex + ".");
        System.out.println("The min element in the 'a' array is " + min + ".");
        System.out.println("The index of " + min + " is " + minIndex + ".");
        System.out.println();








//        3. Create a character array with the elements "racecar"
//        Check if the word is palindromic, using array features

        char[] charArray = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
        int arrSize = charArray.length;
        char [] origArr = Arrays.copyOf(charArray,charArray.length);


        for (int i = 0; i < arrSize / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[arrSize - i - 1];
            charArray[arrSize - i - 1] = temp;
        }

        System.out.println("Original array: " + Arrays.toString(origArr));
        System.out.println("Reverse array: " + Arrays.toString(charArray));
        if (Arrays.equals(charArray, origArr)) {
            System.out.println("Is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
        System.out.println();






//        4. Create a 10 element integer array
//        Assign values to the array as user input
//        Sort the array in ascending order

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++){
            int n = input.nextInt();
            myArray[i] = n;
        }

        System.out.println(Arrays.toString(myArray));

        Arrays.sort(myArray);
        System.out.print(Arrays.toString(myArray));

    }
}
