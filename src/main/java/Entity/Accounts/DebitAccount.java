package Entity.Accounts;

import Tools.DebitWithdrawException;
import Tools.InvalidValueException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DebitAccount implements IAccount {

    private final int days = 365;
    private double balance = 0;
    @NonNull private int ownerId;
    @NonNull private double percent;
    private double monthPayment;

    @Override
    public void withdrawMoney(double money) throws InvalidValueException, DebitWithdrawException {
        if (money < 0) throw new InvalidValueException();
        if (money > balance) throw new DebitWithdrawException();
        balance -= money;
    }

    @Override
    public void addMoney(double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance += money;
    }

    @Override
    public void serviceAccount() throws InvalidValueException, DebitWithdrawException {
        withdrawMoney(monthPayment);
        monthPayment = 0;
    }

    @Override
    public void calculateCommission() {
        monthPayment = (balance * percent) / days;
    }
}
