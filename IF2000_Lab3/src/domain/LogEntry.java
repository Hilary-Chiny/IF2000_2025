/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Lenovo
 */
public class LogEntry {
    
    private static int globalId = 1;

    // ATTRIBUTES
    private int idEvent;
    private String event;       // DEPOSIT, WITHDRAW, INTEREST, TRANSFER
    private String dateTime;
    private String accountInfo;
    private double amount;
    private String details;

    // Constructor
    public LogEntry(String event, String accountInfo, double amount, String details) {
        this.idEvent = globalId++;
        this.event = event;
        this.dateTime = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.accountInfo = accountInfo;
        this.amount = amount;
        this.details = details;
    }

    @Override
    public String toString() {
        return "--------------------------------------"
                + "\n EVENT ID: " + idEvent
                + "\n EVENT TYPE: " + event
                + "\n DATE: " + dateTime
                + "\n ACCOUNT: " + accountInfo
                + "\n AMOUNT: " + amount
                + "\n DETAILS: " + details;
    }
}
