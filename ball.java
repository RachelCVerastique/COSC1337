public class ball extends box{

    boolean inflated;

    public ball(String color, String size, boolean inflated) {
        super();
        this.color = color;
        this.size = size;
        this.inflated = inflated;
    }

    public ball(){

    }

    static void bounceBall(){
        System.out.println("You bounced the ball **bounce** ");
    }

    static void throwBall(){
        System.out.println("You threw the ball");
    }

    static void kickBall(){
        System.out.println("You kicked the ball");
    }

}
