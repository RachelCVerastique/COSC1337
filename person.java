public class person {

    String name;
    String status;
    int age;

    public person(String name, String status, int age) {
        this.name = name;
        this.status = status;
        this.age = age;
    }

     void sayHello(){
        System.out.println(this.name + " says Hello.");
    }

     void sayGoodbye(){
        System.out.println(this.name + " says Goodbye.");
    }

     void wave(){
        System.out.println(this.name + " is waving at you.");
    }




}
