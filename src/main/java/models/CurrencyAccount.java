package models;

public class CurrencyAccount extends Account {


    public CurrencyAccount(Client client) {
        super(client);
    }

    @Override
    public void printData() {
        System.out.println("=== Currency Account Data ===");
        super.printAccountData();
    }


}


