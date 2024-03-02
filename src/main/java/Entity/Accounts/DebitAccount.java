package Entity.Accounts;

import Tools.InvalidValueException;

public class DebitAccount implements IAccount {

    private int balance = 0;
    private int percent;
    private int ownerId;
    private int monthPayment;

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
