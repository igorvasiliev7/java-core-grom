package lesson14;

public class Demo
{
    public static void main(String[] args) {
        Object objectTest=new Object();

        System.out.println(objectTest.getClass().getName());
        System.out.println(objectTest.toString());

        objectTest=new Object();

        System.out.println(objectTest.getClass().getName());
        System.out.println(objectTest.toString());

        objectTest=new Object();

        System.out.println(objectTest.getClass().getName());
        System.out.println(objectTest.toString());

    }
}
