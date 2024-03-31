public class circle {

    int radius;
    final double PI = 3.14159;

    public circle(int radius) {
        this.radius = radius;
    }


    int getRadius(){
        return radius;
    }

    int getDiameter() {
        return radius * 2;
    }

    double getCircumference() {
        return 2 * PI * radius;
    }


}
