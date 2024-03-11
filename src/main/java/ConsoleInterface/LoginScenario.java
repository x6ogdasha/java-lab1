package ConsoleInterface;

import Entity.Banks.Bank;
import Entity.Banks.BankService;
import Entity.Users.UserService;
import Tools.LoginResult;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@AllArgsConstructor
public class LoginScenario extends BaseScenario{

    private final ArrayList<Bank> banks;
    @Override
    public void handle(String command, BankService bankService, UserService userService) {

        if (command == "login") {

            runCommand(bankService, userService);
            return;

        }

        super.handle(command, bankService, userService);
    }

    @Override
    public  void runCommand(BankService bankService, UserService userService) {
        System.out.println("Enter your name: ");

        Scanner in = new Scanner(System.in);
        String idString = in.nextLine();

        if (idString == "emperor") {

            System.out.println("Enter emperor's password: ");
            Integer emperorPassword = in.nextInt();
            bankService.checkForPermission(emperorPassword);
            return;
        }

        if (idString == "bank") {

            System.out.println("Enter bank's name: ");
            String bankName = in.nextLine();
            System.out.println("Enter bank's password: ");
            Integer password = in.nextInt();

            var result = banks.stream().anyMatch(x -> x.getName() == bankName && x.getPin() == password);

            if (result) {
                System.out.println("Successful login");
            } else {
                System.out.println("Bank's not found. Incorrect input");
            }
            return;
        }

        System.out.println("Enter your password: ");
        Integer userPassword = in.nextInt();

       // LoginResult result = userService.login(userId);

    }
}
