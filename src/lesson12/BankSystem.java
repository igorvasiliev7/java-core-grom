package lesson12;

public interface BankSystem {
    void withDraw(User user, int amount);
    void fund(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);

}
