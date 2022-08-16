package models;

import lombok.Data;

@Data
public abstract class Account implements IAccount {

    private static int SEQUENTIAL = 1;
    protected static final int STANDARD_AGENCY = 1;
    protected int agency;
    protected int accountNumber;
    protected double balanceValue;
    protected Client client;

    public Account(Client client) {
        this.agency = STANDARD_AGENCY;
        this.accountNumber = SEQUENTIAL++;
        this.client = client;
    }

    public void withdraw(double value) {
        this.balanceValue -= value;

    }

    public void deposit(double value) {
        this.balanceValue += value;
    }

    public void transfer(double value, Account destinyAccount){
        this.withdraw(value);
        destinyAccount.deposit(value);
    }
    protected void printAccountData() {
        System.out.println(String.format("Holder: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.accountNumber));
        System.out.println(String.format("Balance Value: %.2f", this.balanceValue));
    }


}

