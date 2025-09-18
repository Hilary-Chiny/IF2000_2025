/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author CHINY
 */
public class Bank {
    
    private String name;
    private Map<String, Account> accounts = new HashMap<>();
    
    // Constructor
    public Bank(String name) {
        this.name = name;
    }
    
    // GETTERS
    public String getName() {
        return name;
    }
    
    // METHODS
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }
    
    public Account getAccount(String number) {
        return accounts.get(number);
    }
    
    public boolean ownsAccount(String number) {
        return accounts.containsKey(number);
    }
    
    public Collection<Account> getAllAccounts() {
        return accounts.values();
    }
    
    @Override
    public String toString() {
        return "Bank: " + name + " | Accounts: " + accounts.size();
    }
}
