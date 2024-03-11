package Entity.Banks;

public class BankService {

    private final Integer emperorPassword = 1902;
    Boolean isEmperorLogged = false;
    public void checkForPermission(Integer password) {

        if (password == emperorPassword) {
            isEmperorLogged = true;
        }

    }
}
