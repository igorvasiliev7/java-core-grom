package lesson10;

public class Human {


    public Human(String name) {
        this.name = name;
    }

    private String name;

    void run(){
        System.out.println("Human class is called ...");
        System.out.println(name + " is running");

    }

}
