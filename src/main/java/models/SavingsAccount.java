package models;

public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printData() {
        System.out.println("=== Savings Account Data ===");
        super.printAccountData();
    }

}
