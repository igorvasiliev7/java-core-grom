package lesson12;

public class UkrainainBankSystem implements BankSystem
{

    @Override
    public void withDraw(User user, int amount) {
        int limitOfWithdrawal=user.getBank().getLimitOfWithdrawal();

        if(checkWithdraw(user,amount)) return;

        user.setBalance(user.getBalance()-amount-user.getBank().getComission(amount));
    }

    @Override
    public void fund(User user, int amount) {
//TODO home
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
//
        if(checkWithdraw(fromUser,amount)) return;
        //TODO checkfund

        fromUser.setBalance(fromUser.getBalance()-amount-fromUser.getBank().getComission(amount));

        //TODO fund
        fund(toUser,amount);
    }

    @Override
    public void paySalary(User user) {
//TODO home

    }

    private boolean checkWithdraw(User user, int amount){
       return checkWithdrawLimits(user,amount,user.getBank().getComission(amount))&&
        checkWithdrawLimits(user,amount,user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit  ){
        if(amount+user.getBank().getComission(amount)>limit){
            printWithdrawalErrorMsg(amount,user);
            return false;
        }
        return true;

    }
    private void printWithdrawalErrorMsg(int amount, User user){
    System.err.print("Can`t withdraw monet from user"+amount+user.toString());
}
}
