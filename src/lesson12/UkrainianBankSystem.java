package lesson12;

public class UkrainianBankSystem implements BankSystem
{
    @Override
    public void withdraw(User user, int amount) {
        if(!checkWithdraw(user, amount)) return;
       user.setBalance(user.getBalance()-amount-user.getBank().getCommission(amount));
    }

    @Override
    public void fund(User user, int amount) {
    if(checkLimitOfFunding(user,amount))
        user.setBalance(user.getBalance()+amount*(1+user.getBank().getMonthlyRate()));
//TODO
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if(!checkWithdraw(fromUser, amount)&&!checkLimitOfFunding(toUser,amount)) return;

//TODO check fund
       fromUser.setBalance(fromUser.getBalance()-amount-amount*fromUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance()+amount*(1+toUser.getBank().getMonthlyRate()));
        //TODO withdraw & fund
    }

    @Override
    public void paySalary(User user) {

//TODO
    }

    private boolean checkWithdrawLitim(User user, int amount, double limit){
    if(amount+user.getBank().getCommission(amount)>limit)
    { printWithdrawalErrorMsg( user,amount); return false;}
    return true;
}

    private boolean checkLimitOfFunding(User user, int amount){
        if(user.getBank().getLimitOfFunding()-amount*(1+user.getBank().getMonthlyRate())>0){
           printFundingErrorMsg(user,amount ); return false;}
           return true;
        }


    private boolean checkWithdraw(User user, int amount){
        return   checkWithdrawLitim(user,amount, user.getBank().getLimitOfWithdrawal())&&
                checkWithdrawLitim(user,amount, user.getBalance());

    }
    private void printWithdrawalErrorMsg(User user,int amount ) {
    System.out.println("Can`t withdraw amount = [" + amount + "], user = [" + user + "]");
}
    private void printFundingErrorMsg(User user,int amount ) {
        System.out.println("Can`t fund amount = [" + amount + "], user = [" + user + "]");
    }
}
