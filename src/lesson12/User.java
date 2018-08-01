package lesson12;

public class User {
//    public User() {
//    }

    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
   private int salary;
   private Bank bank;
   private String companyName;

    public User(long id, String name, double balance, int monthsOfEmployment, int salary, Bank bank, String companyName) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
        this.bank = bank;
        this.companyName = companyName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", Salary=" + salary +
                ", bank=" + bank +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public User(long id, String name, double balance, int monthsOfEmployment, int salary,  String companyName, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        salary = salary;
        this.bank = bank;
        this.companyName = companyName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public int getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

    public String getCompanyName() {
        return companyName;
    }
}
