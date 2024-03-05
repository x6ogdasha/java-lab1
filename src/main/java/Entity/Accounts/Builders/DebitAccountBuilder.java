package Entity.Accounts.Builders;

import Entity.Accounts.DebitAccount;
import Entity.Accounts.IAccount;

public class DebitAccountBuilder implements IAccountBuilder{
    private double myPercent;
    private int myAccountId;
    public IAccount build(){
        return new DebitAccount(myAccountId, myPercent);
    }
    @Override
    public IAccountBuilder setAccountId(int accountId) {
        myAccountId = accountId;
        return this;
    }

    @Override
    public IAccountBuilder setCreditLimit(int creditLimit) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setDaysToUnlock(int days) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setPercent(double percent) {
        myPercent = percent;
        return this;
    }

    @Override
    public IAccountBuilder setCommission(int commission) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setLowMiddleHighPercents(double lowPercent, double middlePercent, double highPercent) {
        throw new UnsupportedOperationException();
    }
}
