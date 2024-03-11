package ConsoleInterface;

import Entity.Banks.BankService;
import Entity.Users.UserService;

public class CreateAccountScenario extends BaseScenario{

    @Override
    public void handle(String command, BankService bankService, UserService userService) {

        if (command == "create") {

            runCommand(bankService, userService);
            return;

        }

        super.handle(command, bankService, userService);
    }
    @Override
    public void runCommand(BankService bankService, UserService userService) {

    }
}
