package lesson12;

public class User {
    private long id;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    int Salary;
    Bank bank;
    String companyName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthsOfEmployment=" + monthsOfEmployment +
                ", Salary=" + Salary +
                ", bank=" + bank +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public User(long id, String name, double balance, int monthsOfEmployment, int salary, Bank bank, String companyName) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        Salary = salary;
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
        return Salary;
    }

    public Bank getBank() {
        return bank;
    }

    public String getCompanyName() {
        return companyName;
    }
}
