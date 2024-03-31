import java.util.Scanner;

public class JavaLab7 {
    public static void main(String[] args){
//1.)
        Scanner gradeSc = new Scanner(System.in);
        System.out.println("1.) Enter a grade 0 to 100: ");
        int grade = gradeSc.nextInt();
        letterGrade(grade);

//2.)
        Scanner daySc = new Scanner(System.in);
        System.out.println("2.) Enter a number 1-7 to get the corresponding day of the week: ");
        int day = daySc.nextInt();
        weekDay(day);


//3.)
        Scanner monthSc = new Scanner(System.in);
        System.out.println("3.) Enter a number 1-12 to get the number of days for the corresponding month: ");
        int month = monthSc.nextInt();
        monthDays(month);

    }





//1. Write a program (using switch statement) that input a student's grade (0-100) from the keyboard and prints the corresponding final letter grade as follows:
    //90-100 A
    //80-89  B
    //70-79  C
    //60-69  D
    //0-59   F
    public static void letterGrade(int grade){
        switch (grade / 10) {
            case 10:
            case 9:
                System.out.println("You entered " + grade + "." );
                System.out.println("Your letter grade is A.");
                System.out.println();
                break;
            case 8:
                System.out.println("You entered " + grade + "." );
                System.out.println("Your letter grade is B.");
                System.out.println();
                break;
            case 7:
                System.out.println("You entered " + grade + "." );
                System.out.println("Your letter grade is C.");
                System.out.println();
                break;
            case 6:
                System.out.println("You entered " + grade + "." );
                System.out.println("Your letter grade is D.");
                System.out.println();
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("You entered " + grade + "." );
                System.out.println("Your letter grade is F.");
                System.out.println();;
                break;
        }
    }

//2. Write a program using switch statement that input a day-number between 1 and 7 from keyboard
//   and prints the corresponding day of the week,1 is Monday, 2 is Tuesday, 7 is Sunday etc,

    public static void weekDay(int day){
        switch (day) {
            case 1:
                System.out.println("Monday");
                System.out.println();
                break;
            case 2:
                System.out.println("Tuesday");
                System.out.println();
                break;
            case 3:
                System.out.println("Wednesday");
                System.out.println();
                break;
            case 4:
                System.out.println("Thursday");
                System.out.println();
                break;
            case 5:
                System.out.println("Friday");
                System.out.println();
                break;
            case 6:
                System.out.println("Saturday");
                System.out.println();
                break;
            case 7:
                System.out.println("Sunday");
                System.out.println();
                break;
        }
    }


//3.  Write a program using switch statement that input a month-number between 1 and 12 from keyboard and prints the
//    number of days for the corresponding month. 1 is 31, 2 is 28 (most of the time :D ), 3 is 31 etc,
    public static void monthDays(int month){
        switch (month) {
            case 1:
                System.out.println("January has 31 Days");
                System.out.println();
                break;
            case 2:
                System.out.println("February has 28 Days");
                System.out.println("unless it is a leap year, it will have 29 days.");
                System.out.println();
                break;
            case 3:
                System.out.println("March has 31 Days");
                System.out.println();
                break;
            case 4:
                System.out.println("April has 30 Days");
                System.out.println();
                break;
            case 5:
                System.out.println("May has 31 Days");
                System.out.println();
                break;
            case 6:
                System.out.println("June has 30 Days");
                System.out.println();
                break;
            case 7:
                System.out.println("July has 31 Days");
                System.out.println();
                break;
            case 8:
                System.out.println("August has 31 Days");
                System.out.println();
                break;
            case 9:
                System.out.println("September has 30 Days");
                System.out.println();
                break;
            case 10:
                System.out.println("October has 31 Days");
                System.out.println();
                break;
            case 11:
                System.out.println("November has 30 Days");
                System.out.println();
                break;
            case 12:
                System.out.println("December has 31 Days");
                System.out.println();
                break;
        }
    }


    }
