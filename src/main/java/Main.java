import models.Client;
import models.Account;
import models.CurrencyAccount;
import models.SavingsAccount;

public class Main {

    public static void main(String[] args) {
        Client franciscoFolli = new Client();
        franciscoFolli.setName("Francisco Folli");
        Account ca = new CurrencyAccount(franciscoFolli);
        Account savingsAccount = new SavingsAccount(franciscoFolli);

        ca.deposit(100);
        ca.transfer(50, savingsAccount);
        ca.printData();
        savingsAccount.printData();
    }
}
