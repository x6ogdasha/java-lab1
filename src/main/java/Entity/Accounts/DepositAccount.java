package Entity.Accounts;

import Tools.InvalidValueException;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DepositAccount implements IAccount{

    private final int moneyForLowPercent = 50000;
    private final int moneyForHighPercent = 100000;
    private final int days = 365;
    private int balance = 0;
    private double monthPayment;
    @NonNull private int ownerId;
    @NonNull private double lowPercent;
    @NonNull private double middlePercent;
    @NonNull private double highPercent;
    private int daysToUnlock;


    @Override
    public void withdrawMoney(double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance -= money;
    }

    @Override
    public void addMoney(double money) throws InvalidValueException {
        if (money < 0) throw new InvalidValueException();
        balance += money;
    }

    @Override
    public void serviceAccount() throws InvalidValueException {
        addMoney(monthPayment);
        monthPayment = 0;
    }

    @Override
    public void calculateCommission() {
        if (balance < moneyForLowPercent) {
            monthPayment = (balance * lowPercent) / days;
        } else if (balance > moneyForLowPercent && balance < moneyForHighPercent) {
            monthPayment = (balance * middlePercent) / days;
        } else {
            monthPayment = (balance * highPercent) / days;
        }
    }
}
