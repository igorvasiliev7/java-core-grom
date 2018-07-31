package lesson12;

public abstract class Bank {
private long id;
private String bankCountry;
private Currency currency;
private int numberOjEmployees;
private double avrSalaryOfEmployee;
private long rating;
private long toyalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOjEmployees, double evrSalaryOfEmployee, long rating, long toyalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOjEmployees = numberOjEmployees;
        this.avrSalaryOfEmployee = evrSalaryOfEmployee;
        this.rating = rating;
        this.toyalCapital = toyalCapital;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOjEmployees() {
        return numberOjEmployees;
    }

    public void setNumberOjEmployees(int numberOjEmployees) {
        this.numberOjEmployees = numberOjEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double evrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getToyalCapital() {
        return toyalCapital;
    }

    public void setToyalCapital(long toyalCapital) {
        this.toyalCapital = toyalCapital;
    }

   public abstract int getLimitOfWithdrawal();
   public abstract int getLimitOfFunding();
   public abstract double getMonthlyRate();
   public abstract double getComission(int amount);
   public double moneyPaidMonthlyForSalary(){
       return numberOjEmployees*avrSalaryOfEmployee;

    }

}
