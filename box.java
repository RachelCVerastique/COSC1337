public class box {

    String color;
    String size;
    boolean full;

    public box(String color, String size, boolean full) {
        this.color = color;
        this.size = size;
        this.full = full;
    }

    public box() {
    }


    static void openBox(){
        System.out.println("You opened the box");
    }

    static void closeBox(){
        System.out.println("You closed the box");
    }

    static void away(){
        System.out.println("You put the box away");
    }

}
