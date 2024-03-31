import java.util.Scanner;

public class MidTerm {
    public static void main(String[] args){

        Scanner inputSc = new Scanner(System.in);
        System.out.println("1.) Enter a speed: ");
        int input = inputSc.nextInt();




    int speed;


     if (input < 60) {
         speed = 0;
     } else if (input > 61 && input < 80) {
         speed = 1;
     } else {
         speed = 2;
     }


        switch (speed) {
            case 0:
                System.out.println("No ticket");
                System.out.println();
                break;
            case 1:
                System.out.println("Small ticket");
                System.out.println();
                break;
            case 2:
                System.out.println("Big ticket");
                System.out.println();
                break;
        }

    }
}
