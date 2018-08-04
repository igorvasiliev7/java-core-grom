package lesson15.equals;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File(11, "c:/", "doc");
        File file2 = new File(11, "d:/", "jpg");
        File file3 = new File(11, "c:/", "doc");

        File somefile = file1;

        System.out.println(file1.equals(file2));

        System.out.println(file1.equals(file3));
        System.out.println(file1.hashCode());
        System.out.println(file3.hashCode());
        System.out.println(file1 == file3);
        System.out.println(file1.equals(somefile));

        User user = new User();

        System.out.println(file1.equals(user));
    }

}

