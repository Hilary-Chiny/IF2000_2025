/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CHINY
 */
public class Ledger {
    
    private List<LogEntry> entries = new ArrayList<>();
    
    public void addEntry(String event, String accountInfo, double amount, String details) {
        LogEntry entry = new LogEntry(event, accountInfo, amount, details);
        entries.add(entry);
    }
    
    public void printEntries() {
        System.out.println("\n ===== LEDGER ENTRIES ===== ");
        for (LogEntry e : entries) {
            System.out.println(e);
        }
    }
    
}
