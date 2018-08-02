package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usbank = new USBank(122, "Chicago", Currency.USD, 100, 1400, 100, 22);
        Bank eubank = new EUBank(122, "Sweden", Currency.EUR, 100, 1200, 100, 22);
        User user = new User(1000, "Ringo", 10000, 40, "GMD", 1500, usbank);
        User user2 = new User(1000, "John", 10000, 40, "GMD", 1200, eubank);


        BankSystem bankSystem = new UkrainianBankSystem();
        //bankSystem.fund(user,11000);
      //  bankSystem.withdraw(user,11000);

        bankSystem.transferMoney(user,user2, 5000);

        System.out.println(user.getBalance());
       System.out.println(user2.getBalance());
    }

}
