package lesson15.UserRepository;

public class UserRepository {
    User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public boolean findUser(User user) {
        //User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null&&user!=null) if (users[i].equals(user)) return true;
        }

        return false;
    }

    public User save(User user) {
        if (user == null) return null;
        if (findUser(user)) return null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                return users[i];
            }
        }


        return null;
    }

    public User update(User user) {
        if (user == null) return null;
        if (!findUser(user)) return null;

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) if (users[i].getId() == user.getId()) {
                    users[i] = user;
                return users[i];
            }
        }

        return null;
    }

    public void delete(long id) {

            for (int i = 0; i < users.length; i++) {
                if (users[i] != null) if (users[i].getId() == id) {
                    users[i] = null;

                }
            }
    }
}