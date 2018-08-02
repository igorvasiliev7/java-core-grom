package lesson12;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOjEmployees, double evrSalaryOfEmployee, long rating, long toyalCapital) {
        super(id, bankCountry, currency, numberOjEmployees, evrSalaryOfEmployee, rating, toyalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        if (getCurrency() == Currency.USD) return 100;
        return 150;

    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) return 5000;
        return 10000;
    }

    @Override
    public double getMonthlyRate() {
        if (getCurrency() == Currency.EUR) return 0.0;
        return 0.01;
    }

    @Override
    public double getCommission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) return  0.03;
            else return  0.05;
        } else {if (amount <= 1000) return  0.1;
        else return  0.11;}
    }
}
