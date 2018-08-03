package lesson9;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        UserRepository userRepository=new UserRepository();
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        // save the use
        // save the same user
        // save if array is full
        // save null instead of user
        User user = new User(1009,"Ann", "fff");
        userRepository.save(user);

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        int n=15;
        while(n>0){
            User user1=new User(n, "Ann", "qwqwq");
            System.out.println(userRepository.save(user1));
            n--;
        }
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        userRepository.save(null);

        //test update



// update +
        user = new User(1009, "AAlex", "eee");
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
// update with no id
        user = new User(9009, "AAlex", "eee");
        System.out.println(userRepository.update(user));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        // update null
        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
    }

}
