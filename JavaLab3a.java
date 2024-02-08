public class JavaLab3a {
    public static void main(String[] args){

//  1. declare integer variables hr, min and sec for hours, minutes and seconds respectively. assign 3456 to sec. calculate the number of minutes and hours in 3456 seconds.

        int sec = 3456;
        int min = sec / 60;
        int hr = min / 60;


        System.out.println("1.) There are " + min + " minutes in " + sec + " seconds");
        System.out.println("There are " + hr + " hours in " + sec + " seconds");
        System.out.println();

//  2. explain the order of arithmetic operations in java

        System.out.println("2.) Operations are done in the order of operator precedence from left to right:");
        System.out.println("\t1. parenthesis");
        System.out.println("\t2. multiplication");
        System.out.println("\t3. division");
        System.out.println("\t4. addition");
        System.out.println("\t5. subtraction");
        System.out.println();



//  3. if height is 172 cm and weight is 68kg find the bmi
//  (hint bmi = weight in kg / (height in meters* height in meters)

        int heightCm = 172;
        float heightMeters = (float) heightCm / 100;
        int weightKg = 68;
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("3.) The BMI of " + heightCm + " centimeters and weight in " + weightKg + " kilograms is " + Math.round(bmi) + ".");
        System.out.println();



//  4. find the value of x(y + 2/z)  where x = 4, y = 5.5 and z = .1

        int x = 4;
        double y = 5.5;
        double z = .1;
        double value = (y + 2) / z * x ;

        System.out.println("4. )" + value);
        System.out.println();







    }
}
