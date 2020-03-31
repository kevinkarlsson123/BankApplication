/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import bank.customer.Customer;
import bank.office.Bank;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("arg 1 -> " + args[0]);
        //System.out.println("arg 2 -> " + args[1]);
        
        Bank theBank = new Bank();
        
        theBank.setName("Helix");
        theBank.getCustomerList().add(new Customer("Jhonas Jahanzzon", "20010101-1234"));
        theBank.getCustomerList().add(new Customer("Wiljam Whallnher", "20011103-1236"));
        theBank.getCustomerList().get(0).setBalance(1000.0);
        theBank.getCustomerList().get(1).setBalance(1202.0);
        theBank.updateBankBalance();
        
        System.out.println(theBank.toString());
    }
    
}
