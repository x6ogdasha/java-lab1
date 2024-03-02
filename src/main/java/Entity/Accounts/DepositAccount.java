package Entity.Accounts;

import Tools.InvalidValueException;

public class DepositAccount implements IAccount{

    private int balance = 0;
    private int monthPayment;
    private int lowPercent;
    private int middlePercent;
    private int highPercent;
    private int daysToUnlock;
    private int ownerId;

    @Override
    public void withdrawMoney(int money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance -= money;
    }

    @Override
    public void addMoney(int money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance += money;
    }

    @Override
    public void serviceAccount() {

    }

    @Override
    public void calculateCommission() {

    }
}
