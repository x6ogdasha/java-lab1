package Entity.Banks;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankProperties {
    private String name;
    private double percent;
    private double lowPercent;
    private double middlePercent;
    private double highPercent;
    private int commission;
    private int daysToUnlockDeposit;
}
