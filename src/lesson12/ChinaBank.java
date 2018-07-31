package lesson12;

public class ChinaBank extends Bank {
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOjEmployees, double evrSalaryOfEmployee, long rating, long toyalCapital) {
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
    public double getComission(int amount) {
        return 0;
    }
}
