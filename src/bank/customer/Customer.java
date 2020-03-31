/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.customer;

import bank.person.Person;

/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class Customer extends Person {

    private double balance = 0.0;

    public Customer() {
        super();
    }

    public Customer(double balance) {
        super();
    }
    public Customer(String name, String birthdate) {
        super();
        super.setName(name);
        super.setBirthdate(birthdate);
        super.setGender(birthdate);
        
    }
    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "\n\t{" + super.toString() + ",\n\tBalance : " + this.getBalance() + "\n\t},";
    }
}

