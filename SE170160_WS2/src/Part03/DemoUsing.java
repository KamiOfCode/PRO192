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
public class DemoUsing {
    public static double Total(Employee emp[]) {
         
        double s = 0;
        for (int i = 0; i < emp.length; i++) {
            s += emp[i].salaryc();
        }
        return s;
    }
    
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        
        emp[0] = new Employee("SE", "Le Huu Huy", "0849423457", 500, 1.2, "Vinhomes Grand Park");
        emp[1] = new Employee("SE", "Tam", "04526875", 700, 1.2, "Vinhomes Grand Park");
        emp[2] = new Employee("SE", "Hai", "002254147", 600, 1.2, "Vinhomes Grand Park");
        emp[3] = new Employee("SE", "Kiet", "08547624", 550, 1.2, "Vinhomes Grand Park");
        emp[4] = new Employee("SE", "Khoa", "025955827", 400, 1.2, "Vinhomes Grand Park");
        
        double total = DemoUsing.Total(emp);
        System.out.println("Total salary: " + total);
        System.out.println("------------------------");
        
        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
        System.out.println(emp[3]);
        System.out.println(emp[4]);
    }
}
