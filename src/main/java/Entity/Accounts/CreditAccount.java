package Entity.Accounts;

import Tools.CreditBalanceException;
import Tools.InvalidValueException;


public class CreditAccount implements IAccount{

    private int balance = 0;
    private int creditLimit;
    private int commission;
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
    public void serviceAccount() throws InvalidValueException {
        addMoney(commission);
        commission = 0;
    }

    @Override
    public void calculateCommission() throws CreditBalanceException {
        if (balance < creditLimit) throw new CreditBalanceException();
    }
}
