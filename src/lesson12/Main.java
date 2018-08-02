package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usbank=new USBank(122,"Chicago",Currency.USD, 100, 1400, 100, 22);
        Bank eubank=new USBank(122,"Sweden",Currency.EUR, 100, 1200, 100, 22);
         User user = new User(1000, "Ringo", 12200, 40, "GMD",1500,  usbank);
        User user2 = new User(1000, "John", 1000, 40, "GMD",1200,  eubank);


         BankSystem bankSystem=new UkrainianBankSystem();
     //    bankSystem.withdraw(user,150);
      //  bankSystem.fund(user,11000);
       // bankSystem.transferMoney(user,user2, 150);

        System.out.println(user.getBalance());
        System.out.println(user2.getBalance());
    }

}
