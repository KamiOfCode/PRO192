/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop4;

/**
 *
 * @author win
 */
public class PartTime extends Employee{
    private int wage;
    private int present;

    public PartTime() {
    }

    public PartTime(int wage, int present, String code, String name, int phone, String address, String department) {
        super(code, name, phone, address, department);
        this.wage = wage;
        this.present = present;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getPresent() {
        return present;
    }

    public void setPresent(int present) {
        this.present = present;
    }
    
    public int getDailyWage() {
        return wage * present;
    }
    
    public String toString() {
        return super.getCode() + " - " + super.getName() + " - " + getDailyWage();
    }
}
