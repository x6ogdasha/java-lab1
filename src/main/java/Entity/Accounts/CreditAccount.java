package Entity.Accounts;

import Tools.CreditBalanceException;
import Tools.CreditLimitException;
import Tools.InvalidValueException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreditAccount implements IAccount{

    private Double balance = 0.0;
    @NonNull private Integer creditLimit;
    @NonNull private Integer ownerId;
    @NonNull private Double commission;


    @Override
    public void withdrawMoney(Double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance -= money;
    }

    @Override
    public void addMoney(Double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance += money;
    }

    @Override
    public void serviceAccount() throws InvalidValueException {
        addMoney(commission);
        commission = 0.0;
    }

    @Override
    public void calculateCommission() throws CreditLimitException, CreditBalanceException {
        if (balance < 0) throw new CreditBalanceException();
        if (balance < creditLimit) throw new CreditLimitException();
    }
}
