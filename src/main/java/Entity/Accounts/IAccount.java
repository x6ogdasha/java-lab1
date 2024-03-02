package Entity.Accounts;

import Tools.CreditBalanceException;
import Tools.InvalidValueException;

public interface IAccount {
    public void withdrawMoney(int money) throws InvalidValueException;
    public void addMoney(int money) throws InvalidValueException;
    public void serviceAccount() throws InvalidValueException;
    public void calculateCommission() throws CreditBalanceException;
}
