/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part03;

/**
 *
 * @author win
 */
public class Employee {
    String code;
    String fullName;
    String phone;
    int salary;
    double salaryCoefficient;
    String department;
    double salaryc;
    

    public Employee(String code, String fullName, String phone, int salary, double salaryCoefficient, String department) {
        this.code = code;
        this.fullName = fullName;
        this.phone = phone;
        this.salary = salary;
        this.salaryCoefficient = salaryCoefficient;
        this.department = department;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public double salaryc() {
        return salaryc = salary * salaryCoefficient;
    }
    
    public String toString() {
        return code + " - " + fullName + " - " + phone + " - " + salaryc() + " - " + department;
    }
}
