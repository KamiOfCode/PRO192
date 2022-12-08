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
public class FullTime extends Employee{
    private int salary;
    private int absent;

    public FullTime() {
    }

    public FullTime(int salary, int absent, String code, String name, int phone, String address, String department) {
        super(code, name, phone, address, department);
        this.salary = salary;
        this.absent = absent;
    }

    public long getSalary() {
        return salary - (absent * 35);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAbsent() {
        return absent;
    }

    public void setAbsent(int absent) {
        this.absent = absent;
    }
    
    public String toString() {
        return super.getCode() + " - " + super.getName() + " - " + getSalary();
    }
}
