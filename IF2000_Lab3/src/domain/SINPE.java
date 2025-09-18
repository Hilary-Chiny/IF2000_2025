/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;


public class SINPE {

    private List<Bank> banks = new ArrayList<>();

    // SINPE SYSTEM
    public void addBank(Bank bank) {
        banks.add(bank);
    }

    
    public Bank findBankByAccount(String accountNumber) {
        for (Bank bank : banks) {
            if (bank.ownsAccount(accountNumber)) {
                return bank;
            }
        }
        return null;
    }

    
    public boolean transfer(String fromAccountNumber, String toAccountNumber, double amount, Ledger ledger) {
        Bank fromBank = findBankByAccount(fromAccountNumber);
        Bank toBank = findBankByAccount(toAccountNumber);

        if (fromBank == null || toBank == null) {
            System.out.println("One or both accounts do not exist in SINPE.");
            return false;
        }

        Account fromAccount = fromBank.getAccount(fromAccountNumber);
        Account toAccount = toBank.getAccount(toAccountNumber);

        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient funds in account " + fromAccountNumber);
            return false;
        }

        // PERFORM TRANSFER
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);

        // REGISTER MOVEMENTS
        ledger.addEntry("SINPE Transfer OUT", fromAccount.getAccountNumber(), amount,
                "Transfer to " + toAccount.getAccountNumber());
        ledger.addEntry("SINPE Transfer IN", toAccount.getAccountNumber(), amount,
                "Transfer from " + fromAccount.getAccountNumber());

        System.out.println("Transfer successful: " + amount + " from "
                + fromAccountNumber + " to " + toAccountNumber);

        return true;
    }
}
