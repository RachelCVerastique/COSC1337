//------------------------------------------------------
//Programmer: Rachel Verastique
//Course: COSC-1337-002
//Semester: Spring 2024
//Date: January 25, 2024
//------------------------------------------------------

public class JavaLab2 {
    public static void main(String[] args){

//  1. convert 22 degrees celsius to Fahrenheit

        double celsiusTemp = 22;
        double fahrenheit = (celsiusTemp * 9) / 5 + 32;

        System.out.println("1.) 22 degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        System.out.println();


//  2. convert 15 inches to centimeters   (hint: 1 inch is 2.54cm)

        double inches = 15;
        double centimeters = inches * 2.54;

        System.out.println("2.) 15 inches is equal to " + centimeters + " centimeters.");
        System.out.println();


//  3. how many inches is 6 ft

        double feet = 6;
        double inches1 = feet * 12;

        System.out.println("3.) 6 feet is equal to " + inches1 + " inches.");
        System.out.println();

//  4. give the estimated age in years of a person born in the year 1997

        int year = 1997;
        int estAge = 2024 - year;

        System.out.println("4.) The estimated age for someone born in 1997 is " + estAge + " years old.");
        System.out.println();

//  5. if y = 2x2+3x-4 ; find y if x is 10

        int x = 10;
        double y = (Math.pow(x,2) * 2) + (3 * x) - 4;

        System.out.println("5.) y = " + y);


    }
}
