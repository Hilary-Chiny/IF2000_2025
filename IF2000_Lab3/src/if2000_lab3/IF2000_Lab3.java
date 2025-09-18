/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if2000_lab3;
import domain.Person;
import domain.SavingAccount;
import domain.CheckingAccount;
import domain.Bank;
import domain.Ledger;
import domain.SINPE;
/**
 *
 * @author Lenovo
 */
public class IF2000_Lab3 {

   
    public static void main(String[] args) {
      // --- LEDERG (Bitácora) ---
        Ledger ledger = new Ledger();

        // --- CLIENTS ---
        Person client1 = new Person("Hilary", "Chiny", "7-0328-0297", "89446568", 18);
        Person client2 = new Person("Bob", "Smith", "1-2345-6789", "81234567", 25);

        // --- ACCOUNTS ---
        SavingAccount account1 = new SavingAccount("2025-09-04", 12, 5, "1000567801", 25000, client1);
        CheckingAccount account2 = new CheckingAccount(1.2f, "2000567802", 15000, client2);

        // --- BANKS ---
        Bank bank1 = new Bank("BANCK COSTA RICA");
        Bank bank2 = new Bank("BANK NATIONAL");

        bank1.addAccount(account1);
        bank2.addAccount(account2);

        // ---  SINPE ---
        SINPE sinpe = new SINPE ();
        sinpe.addBank(bank1);
        sinpe.addBank(bank2);

        // --- SIMULATION OF DEPOSIT IN THE ACCOUNT ---
        account1.deposit(3000);
        ledger.addEntry("deposit", account1.getAccountNumber(), 3000, "Direct deposit");

        System.out.println(account1.toString());
        System.out.println("\n--------------------------------------");
        System.out.println("Withdraw of money");
        System.out.println("\n--------------------------------------");

        // --- SIMULATION WITHDRAW ---
        account1.withdraw(16000);
        ledger.addEntry("withdraw", account1.getAccountNumber(), 16000, "ATM withdrawal");

        System.out.println(account1.toString());

        // --- SIMULATION TRANSFER ---
        System.out.println("\n--- Attempt transfer ---");
        sinpe.transfer("1000567801", "2000567802", 5000, ledger);//SINPE TRANSFER

        // --- INTEREST ---
        double newBalanceSaving = account1.interestCalculation();
        ledger.addEntry("interest", account1.getAccountNumber(), newBalanceSaving, "Interest applied");
        account1.setBalance(newBalanceSaving);

        double newBalanceChecking = account2.interestCalculation();
        ledger.addEntry("interest", account2.getAccountNumber(), newBalanceChecking, "Interest applied");
        account2.setBalance(newBalanceChecking);

        // --- FINAL ACCOUNT ---
        System.out.println("\n--- Final balances ---");
        System.out.println(account1);
        System.out.println(account2);

        // --- PRINT LEDGER ---
        ledger.printEntries();
    }
    
}
