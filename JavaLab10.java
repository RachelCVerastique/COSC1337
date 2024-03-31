@SuppressWarnings("ALL")
public class JavaLab10 {
    public static void main(String[] args) {
//  Person --------------------------------------------------------------------------------------
        person person1 = new person("Bob Marley", "Married", 42);
        person person2 = new person("Jennifer Lopez", "Married", 52);
        person person3 = new person("Leonardo Dicaprio", "Single", 41);


        System.out.println();

        person1.sayHello();
        person2.sayGoodbye();
        person3.wave();

//  Box --------------------------------------------------------------------------------------
        box box1 = new box("Blue", "Medium", false);
        box box2 = new box("Green", "Small", true);
        box box3 = new box("Pink", "Large", true);


        System.out.println();

        box.openBox();
        box.away();
        box.closeBox();

//  ball --------------------------------------------------------------------------------------
        ball ball1 = new ball("Rainbow", "Extra Large", false);
        ball ball2 = new ball("Pink / Purple", "Small", true);
        ball ball3 = new ball("Black /Yellow", "Large", true);


        System.out.println();

        ball.bounceBall();
        ball.throwBall();
        ball.kickBall();


//  circle --------------------------------------------------------------------------------------
        circle circle1 = new circle(2);
        circle circle2 = new circle(4);
        circle circle3 = new circle(6);


        System.out.println();

        System.out.println(circle1.getRadius());
        System.out.println(circle1.getDiameter());
        System.out.println(circle1.getCircumference());



    }
}
