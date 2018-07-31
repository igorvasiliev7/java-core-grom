package lesson12;

public class UkrainainBankSystem implements BankSystem
{
    @Override
    public void withDraw(User user, int amount) {
        int limitOfWithdrawal=user.getBank().getLimitOfWithdrawal();
        if(amount>limitOfWithdrawal) System.err.print("Can`t withdraw monet from user"+user);

    }

    @Override
    public void fund(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
