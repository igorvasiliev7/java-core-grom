package lesson12;

public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOjEmployees, double evrSalaryOfEmployee, long rating, long toyalCapital) {
        super(id, bankCountry, currency, numberOjEmployees, evrSalaryOfEmployee, rating, toyalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    public int getLimitOfFunding() {
        return 0;
    }

    @Override
    public double getMonthlyRate() {
        return 0;
    }

    @Override
    public double getCommission(int amount) {
        return 0;
    }
}
