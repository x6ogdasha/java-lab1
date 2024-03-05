package Entity.Banks;

import Entity.Accounts.AccountType;
import Entity.Accounts.Builders.AccountDirector;
import Entity.Accounts.Builders.CreditAccountBuilder;
import Entity.Accounts.IAccount;
import Entity.Users.User;
import Tools.InvalidValueException;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Map;
import java.util.stream.Stream;

@AllArgsConstructor
public class Bank {

    private Map<User, ArrayList<Integer>> users;
    private final Map<IAccount, Integer> accounts;

    private String name;
    private Double percent;
    private Double lowPercent;
    private Double middlePercent;
    private Double highPercent;
    private Double commission;
    private Integer creditLimit;
    private Integer daysToUnlockDeposit;

    private void updateAccountInformation(User user, Integer accountId, IAccount account) {
        if (users.containsKey(user)) {

            ArrayList<Integer> userAccountIds = users.get(user);
            userAccountIds.add(accountId);

            users.put(user, userAccountIds);

        } else {

            ArrayList<Integer> newAccountIds = new ArrayList<>();
            newAccountIds.add(accountId);

            users.put(user, newAccountIds);
        }

    }

    public IAccount createDebitAccount(User user, Integer accountId) throws InvalidValueException {

        IAccount creditAccount = AccountDirector.create(AccountType.Credit)
                .setAccountId(accountId)
                .setPercent(percent)
                .build();

        accounts.put(creditAccount, accountId);

        updateAccountInformation(user, accountId, creditAccount);

        return creditAccount;

    }

    public IAccount createCreditAccount(User user, Integer accountId) throws InvalidValueException {
        IAccount creditAccount = AccountDirector.create(AccountType.Credit)
                .setAccountId(accountId)
                .setCommission(commission)
                .setCreditLimit(creditLimit)
                .build();

        updateAccountInformation(user, accountId, creditAccount);

        return creditAccount;
    }

    public IAccount createDepositAccount(User user, Integer accountId) throws InvalidValueException {
        IAccount depositAccount = AccountDirector.create(AccountType.Deposit)
                .setAccountId(accountId)
                .setDaysToUnlock(daysToUnlockDeposit)
                .setLowMiddleHighPercents(lowPercent, middlePercent, highPercent)
                .build();

        updateAccountInformation(user, accountId, depositAccount);

        return depositAccount;
    }

    public void addNewUser(User user) throws InvalidValueException {

        if (users.containsKey(user)) throw new InvalidValueException();
        ArrayList<Integer> newUserAccounts = new ArrayList<>();
        users.put(user, newUserAccounts);
    }

}
