package Entity.Accounts.Builders;

import Entity.Accounts.IAccount;

public interface IAccountBuilder {
    public IAccountBuilder setAccountId(int ownerId);
    public IAccountBuilder setCreditLimit(int creditLimit);
    public IAccountBuilder setDaysToUnlock(int days);
    public IAccountBuilder setPercent(double percent);
    public IAccountBuilder setCommission(int commission);
    public IAccountBuilder setLowMiddleHighPercents(double lowPercent, double middlePercent, double highPercent);
    public IAccount build();
}
