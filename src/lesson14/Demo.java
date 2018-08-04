package lesson14;

public class Demo
{
    public static void main(String[] args) {
        Object objectTest=new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());


        objectTest=new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());


        objectTest=new Object();
        System.out.println(objectTest.toString());
        System.out.println(objectTest.getClass().getName());

        Object test=new Object();
        System.out.println(test.toString());
        System.out.println(test.getClass().getName());
        Object test2=new Object();
        System.out.println(test2.toString());
        System.out.println(test2.getClass().getName());

    }
}
