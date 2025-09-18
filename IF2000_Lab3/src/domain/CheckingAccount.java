/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Lenovo
 */
public class CheckingAccount extends Account {
    
    
     // ATRIBUTOS
    private float interest; // annual interest rate in percentage (e.g., 1.2 = 1.2%)
    
    
    public CheckingAccount() {
    }

    public CheckingAccount(float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.interest = interest;
    }

    // GETTERS & SETTERS
    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    // METHODS DEPOSIT
    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= this.getBalance()) {
            super.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("You don't have enough money");
        }
    }

    @Override
    public double interestCalculation() {
        // ANNUAL INTEREST
        double rate = this.getInterest() / 100.0;

        // MONTHLY INTEREST
        double interestEarned = (super.getBalance() * rate) / 12.0;

        // RETURN FINAL BALANCE AFTER INTEREST
        return super.getBalance() + interestEarned;
    }

    @Override
    public String toString() {
        double rate = this.getInterest() / 100.0;
        double interestEarned = (super.getBalance() * rate) / 12.0;
        double finalBalance = super.getBalance() + interestEarned;

        String result = "\n ACCOUNT Type: CHECKING ACCOUNT"
                + "\n --------------------------------------"
                + "\n Interest: " + this.getInterest()
                + "\n Earned Interest: " + interestEarned
                + "\n Balance after interest: " + finalBalance;
        return super.toString() + result;
    }
}
