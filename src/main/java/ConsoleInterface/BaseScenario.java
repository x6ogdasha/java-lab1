package ConsoleInterface;

import Entity.Banks.BankService;
import Entity.Users.UserService;
import lombok.Getter;
import lombok.Setter;

public abstract class BaseScenario {

   @Getter @Setter public BaseScenario nextScenario;

   public BaseScenario setNext(BaseScenario scenario) {

       nextScenario = scenario;
       return nextScenario;

   }

   public void handle(String command, BankService bankService, UserService userService) {

       nextScenario.handle(command, bankService, userService);

   }

   public abstract void runCommand(BankService bankService, UserService userService);
}
