package Entity.Accounts;

import Tools.CreditBalanceException;
import Tools.CreditLimitException;
import Tools.InvalidValueException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreditAccount implements IAccount{

    private int balance = 0;
    @NonNull private int creditLimit;
    @NonNull private int commission;
    @NonNull private int ownerId;

    @Override
    public void withdrawMoney(double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance -= money;
    }

    @Override
    public void addMoney(double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance += money;
    }

    @Override
    public void serviceAccount() throws InvalidValueException {
        addMoney(commission);
        commission = 0;
    }

    @Override
    public void calculateCommission() throws CreditLimitException, CreditBalanceException {
        if (balance < 0) throw new CreditBalanceException();
        if (balance < creditLimit) throw new CreditLimitException();
    }
}
