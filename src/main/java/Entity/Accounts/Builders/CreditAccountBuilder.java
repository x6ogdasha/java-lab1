package Entity.Accounts.Builders;

import Entity.Accounts.CreditAccount;
import Entity.Accounts.IAccount;

public class CreditAccountBuilder implements IAccountBuilder{
    private int myCreditLimit;
    private int myAccountId;
    private int myCommission;

    public IAccount build(){
        return new CreditAccount(myCreditLimit, myAccountId, myCommission);
    }
    @Override
    public IAccountBuilder setAccountId(int accountId) {
        myAccountId = accountId;
        return this;
    }

    @Override
    public IAccountBuilder setCreditLimit(int creditLimit) {
        myCreditLimit = creditLimit;
        return this;
    }

    @Override
    public IAccountBuilder setDaysToUnlock(int days) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setPercent(double percent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setCommission(int commission) {
        myCommission = commission;
        return this;
    }

    @Override
    public IAccountBuilder setLowMiddleHighPercents(double lowPercent, double middlePercent, double highPercent) {
        throw new UnsupportedOperationException();
    }
}
