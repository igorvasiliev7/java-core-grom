package lesson15.UserRepository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User user1=new User(1,"q","a");
        User user2=new User(2,"w","s");
        User user3=new User(3,"e","d");
        User user4=new User(4,"r","d");
        User user5=new User(5,"t","a");
        User user6=new User(6,"t","a");

        User[] users=new User[5];

        UserRepository userRepository=new UserRepository(users);
        System.out.println(Arrays.toString(userRepository.getUsers()));
        //Save
        //add+
        //if null+
        //if full+
        // if User is already exist+
        System.out.println(userRepository.save(user1));
        System.out.println(userRepository.save(user2));
        System.out.println(userRepository.save(user3));
        System.out.println(userRepository.save(user4));
        System.out.println(userRepository.save(user5));
        //Update
        //update+
        //if user=null+
        //if no such user+


       System.out.println(userRepository.update(user6));
        System.out.println(Arrays.toString(userRepository.getUsers()));

    }
}
