package Entity.Accounts.Builders;

import Entity.Accounts.CreditAccount;
import Entity.Accounts.IAccount;

public class CreditAccountBuilder implements IAccountBuilder{
    private Integer myCreditLimit;
    private Integer myAccountId;
    private Double myCommission;

    public IAccount build(){
        return new CreditAccount(myCreditLimit, myAccountId, myCommission);
    }
    @Override
    public IAccountBuilder setAccountId(Integer accountId) {
        myAccountId = accountId;
        return this;
    }

    @Override
    public IAccountBuilder setCreditLimit(Integer creditLimit) {
        myCreditLimit = creditLimit;
        return this;
    }

    @Override
    public IAccountBuilder setDaysToUnlock(Integer days) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setPercent(Double percent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IAccountBuilder setCommission(Double commission) {
        myCommission = commission;
        return this;
    }

    @Override
    public IAccountBuilder setLowMiddleHighPercents(Double lowPercent, Double middlePercent, Double highPercent) {
        throw new UnsupportedOperationException();
    }
}
