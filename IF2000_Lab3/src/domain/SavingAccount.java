/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Lenovo
 */
public class SavingAccount extends Account{
     
    // Atributes
    
    private String initialDate;
    private int months;
    private float interest;
    
    //CONSTRUCTOR

    public SavingAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    

    @Override
    public void deposit(double amount) {
        
        super.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <=this.getBalance())
            super.setBalance(this.getBalance() - amount);
        else 
            System.out.println("You dont have enough money");
    }

    @Override
public double interestCalculation() {
    // INTERES ANUAL
    double tasa = this.getInterest() / 100.0;

    // INTERES GANADO A LOS 12 MESES
    double interesEarned = super.getBalance() * tasa * (this.getMonths() / 12.0);

    // RETORNA EL SALDO DESPUES DEL INTERES
    return super.getBalance() + interesEarned;
}

@Override
public String toString() {
    double tasa = this.getInterest() / 100.0;
    double interesEarned = super.getBalance() * tasa * (this.getMonths() / 12.0);
    double saldoFinal = super.getBalance() + interesEarned;

    String result = "\n ACCOUNT Type: SAVING ACCOUNT"
            + "\n --------------------------------------"
            + "\n Initial date of account: " + this.getInitialDate()
            + "\n Months of saving: " + this.getMonths()
            + "\n Interest: " + this.getInterest()
            + "\n Gained Interest: " + interesEarned
            + "\n Balance after interest: " + saldoFinal;
    return super.toString()+result;
}//END ToString
    
    
}
