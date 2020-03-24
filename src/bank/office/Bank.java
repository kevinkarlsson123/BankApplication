/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.office;

import bank.customer.Customer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class Bank {

    private String name = "";
    private List<Customer> customerList = new ArrayList();
    private double bankBalance = 0.0;

    public Bank() {

    }

    public Bank(String name, ArrayList<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the customerList
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }

    /**
     * @param customerList the customerList to set
     */
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    /**
     * @return the bankBalance
     */
    public double getBankBalance() {
        return bankBalance;
    }

    /**
     * Update the balance for the bank 
     */
    public void updateBankBalance() {
        for (Customer customer : customerList) {
            this.bankBalance += customer.getBalance();
        }
    }
    
    /**
     * TODO: Validering av nya kunder. Kontrollera att kunden inte redan är kund genom att kolla om personnummer inte redan finns i customerList.
     * 
     * @param customer 
     */
    public void addNewCustomer(Customer newCustomer){
        // Här borde man köra med try/catch men vi kör if sats för enkelhetensskull.
        for (Customer currentCustomer : customerList) {
            
            if (currentCustomer.getBirthdate().equals(newCustomer.getBirthdate())) {
                // Kunden finns redan.
            } else {
                // kunden är ny, lägg till kunden.
                this.getCustomerList().add(newCustomer);
            }
        }
        
    }
        
    @Override
    public String toString() {
        return "/n/tName : " + this.getName() + ",/n/tCustomers : " + this.getCustomerList().size()  + ",/n/tBankBalance : " + this.getBankBalance() + "/n/t";
    }

}

