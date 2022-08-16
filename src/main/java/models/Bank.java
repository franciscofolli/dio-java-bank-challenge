package models;

import lombok.Data;

import java.util.List;

@Data
public class Bank {

    private String name;
    private List<Account> accounts;

}
