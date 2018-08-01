package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usbank=new USBank(122,"Sweden",Currency.EUR, 100, 1400, 100, 22);
         User user = new User(1000, "Ringo", 12200, 40, "GMD",1500,  usbank);

         BankSystem bankSystem=new UkrainianBankSystem();
         bankSystem.withdraw(user,150);

        System.out.println(user.getBalance());
    }

}
