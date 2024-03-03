package Entity.Accounts;

import Tools.CreditBalanceException;
import Tools.CreditLimitException;
import Tools.DebitWithdrawException;
import Tools.InvalidValueException;

public interface IAccount {
    public void withdrawMoney(double money) throws InvalidValueException, DebitWithdrawException;
    public void addMoney(double money) throws InvalidValueException;
    public void serviceAccount() throws InvalidValueException, DebitWithdrawException;
    public void calculateCommission() throws CreditLimitException, CreditBalanceException;
}
