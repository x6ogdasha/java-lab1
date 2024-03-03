package Entity.Accounts.Builders;

import Entity.Accounts.DepositAccount;
import Entity.Accounts.IAccount;

public class DepositAccountBuilder implements IAccountBuilder{
    private int myOwnerId;
    private double myLowPercent;
    private double myMiddlePercent;
    private double myHighPercent;
    @Override
    public IAccountBuilder setOwnerId(int ownerId) {
        myOwnerId = ownerId;
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
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setCommission(int commission) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setLowMiddleHighPercents(double lowPercent, double middlePercent, double highPercent) {
        myLowPercent = lowPercent;
        myMiddlePercent = middlePercent;
        myHighPercent = highPercent;
        return this;
    }

    @Override
    public IAccount create() {
        return new DepositAccount(myOwnerId, myLowPercent, myMiddlePercent, myHighPercent);
    }
}
