package lesson12;

public class UkrainianBankSystem implements BankSystem
{
    @Override
    public void withdraw(User user, int amount) {
        if(!checkWithdraw(user, amount)) return;
       user.setBalance(user.getBalance()-amount-amount*user.getBank().getCommission(amount));
    }



        private void printWithdrawalErrorMsg(int amount, User user) {
            System.out.println("Can`t withdraw amount = [" + amount + "], user = [" + user + "]");
        }


    @Override
    public void fund(User user, int amount) {
//TODO
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if(!checkWithdraw(fromUser, amount)) return;
//TODO check fund
       fromUser.setBalance(fromUser.getBalance()-amount-amount*fromUser.getBank().getCommission(amount));
        //TODO withdraw & fund
    }

    @Override
    public void paySalary(User user) {
//TODO
    }

    private boolean checkWithdrawLitim(User user, int amount, double limit){
    if(amount+user.getBank().getCommission(amount)>limit)
    { printWithdrawalErrorMsg(amount, user); return false;}
    return true;
}

    private boolean checkWithdraw(User user, int amount){
        return   checkWithdrawLitim(user,amount, user.getBank().getLimitOfWithdrawal())&&
                checkWithdrawLitim(user,amount, user.getBalance());

    }
}
