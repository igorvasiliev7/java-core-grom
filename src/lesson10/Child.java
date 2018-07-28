package lesson10;

public class Child extends Human {
    public Child(String name) {
        super(name);
    }

    void run(){
        System.out.println("User class is called ...");
        super.run();
    }
}
