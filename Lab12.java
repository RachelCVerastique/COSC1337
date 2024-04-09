import java.util.Arrays;
import java.util.Scanner;

public class Lab12 {

    public static void main(String[] args) {

//1.) Write a Java program to reverse a given string
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("1.) Enter a word or sentence: ");
        String oString = scanner1.nextLine();
        String rString = "";

        for (int i = 0; i < oString.length(); i++) {
            rString = oString.charAt(i) + rString;
        }

        System.out.println(rString);
        System.out.println();


//2. Write a Java program to count the vowels in a given string

    int vowelCount = 0;
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("2.) Enter a word or sentence: ");
    String strInput = scanner2.nextLine();

        for (int i = 0; i < strInput.length(); i++) {
            if(strInput.charAt(i) == 'a' || strInput.charAt(i) == 'e' || strInput.charAt(i) == 'i' || strInput.charAt(i) == 'o' || strInput.charAt(i) == 'u'){
                vowelCount++;
            } else if (strInput.charAt(i) == 'A' || strInput.charAt(i) == 'E' || strInput.charAt(i) == 'I' || strInput.charAt(i) == 'O' || strInput.charAt(i) == 'U') {
                vowelCount++;
            }
        }

    System.out.println(strInput + " has " + vowelCount + " vowels.");
    System.out.println();


//3. Write a Java program to change every letter in a given string with the letter following it in the alphabet (i.e. a becomes b, p becomes q, z becomes a)


        Scanner scanner3 = new Scanner(System.in);
        System.out.println("3.) Enter a message: ");
        String message = scanner3.nextLine();


        StringBuilder newMessage = new StringBuilder();
        message = message.toLowerCase();

        for (int i = 0; i < message.length(); i++) {
            char x = message.charAt(i);
            if(Character.isLetter(x)){
                x = (char) ((x - 'a' + 1 + 26) % 26 + 'a');
            }

            newMessage.append(x);
        }

        System.out.println(newMessage);
        System.out.println();



//4. Write a Java program to capitalize the first letter of each word in a given string. Words must be separated by only one space

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("4.) Enter a sentence: ");
            String originalSentence = scanner4.nextLine();

            String[] words = originalSentence.split(" ");
            StringBuilder modifiedSentence = new StringBuilder();

            for (String word : words) {
                modifiedSentence.append(Character.toTitleCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
        }
        System.out.println(modifiedSentence.toString().trim());
        System.out.println();



//5. Write a Java program to sort characters (numbers and punctuation symbols are not included) in a string

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("5.) Enter a sentence: ");
        String originalTxt = scanner5.nextLine();

        char[] myCharArr =originalTxt.toCharArray();

        char temp;

        for (int i = 0; i < myCharArr.length; i++) {
            for (int j = i + 1; j < myCharArr.length; j++) {
                if(myCharArr[i] > myCharArr[j]){
                    temp = myCharArr[i];
                    myCharArr[i] = myCharArr[j];
                    myCharArr[j] = temp;
                }
            }
        }

        System.out.println(new String(myCharArr));
        System.out.println();


    }

}
