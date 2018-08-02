package lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {
        if (!checkWithdraw(user, amount)) return;
        user.setBalance(user.getBalance() - amount - (amount * user.getBank().getCommission(amount))); return;
    }

    @Override
    public void fund(User user, int amount) {
        if (checkLimitOfFunding(user, amount))
            user.setBalance(user.getBalance() + amount );
//TODO
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        //TODO check fund & withdraw
        if (!checkWithdraw(fromUser, amount) || !checkLimitOfFunding(toUser, amount)) return;


        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount );
        //TODO withdraw & fund
    }

    @Override
    public void paySalary(User user) {
        if (checkLimitOfFunding(user, user.getSalary() * user.getMonthsOfEmployment()))
            user.setBalance(user.getBalance() + user.getSalary() * user.getMonthsOfEmployment()
                    + (user.getSalary() * user.getMonthsOfEmployment() * user.getBank().getMonthlyRate()));

//TODO
    }


    private boolean checkWithdrawLimit(User user, int amount, double limit) {
        if (amount + user.getBank().getCommission(amount) > limit) {
            printWithdrawalErrorMsg(user, amount);
            return false;
        }
        return true;
    }

    private boolean checkLimitOfFunding(User user, int amount) {
        if (user.getBank().getLimitOfFunding() - amount - (amount * user.getBank().getMonthlyRate()) < 0) {
            printFundingErrorMsg(user, amount);
            return false;
        }
        return true;
    }


    private boolean checkWithdraw(User user, int amount) {
        return checkWithdrawLimit(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimit(user, amount, user.getBalance());

    }

    private void printWithdrawalErrorMsg(User user, int amount) {
        System.out.println("Can`t withdraw amount = [" + amount + "], user = [" + user + "]");
    }

    private void printFundingErrorMsg(User user, int amount) {
        System.out.println("Can`t fund amount = [" + amount + "], user = [" + user + "]");
    }
}
