package Entity.Accounts.Builders;

import Entity.Accounts.DepositAccount;
import Entity.Accounts.IAccount;

public class DepositAccountBuilder implements IAccountBuilder{
    private int myAccountId;
    private double myLowPercent;
    private double myMiddlePercent;
    private double myHighPercent;
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
    public IAccount build() {
        return new DepositAccount(myAccountId, myLowPercent, myMiddlePercent, myHighPercent);
    }
}
