/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank.person;
/**
 *
 * @author Lars Nordstrom <lars.nordstrom@jgy.se>
 */
public class Person {

    private String name = "";
    private String birthdate = "";
    private String gender = "";

    public Person() {

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
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        
        // Hämtar näst sista siffran i p-nummer, konverterar det till heltal och lagrar det i variabelm num.
        int num = (int) gender.charAt(gender.length() - 2);
        // Tilldelar ett värde genom att kontrollera om  variabeln num är ojämn. Ojämn = man
        this.gender = ((num % 2) == 1) ? "man" : "kvinna";

    }

    @Override
    public String toString() {
        return "\n\tName : " + this.getName() + ",\n\tGender : " + this.getGender() + ",\n\tBirthdate : " + this.getBirthdate();
    }

}

