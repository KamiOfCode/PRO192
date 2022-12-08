/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part02;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class UsingEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code;
        String fullName;
        int age = 0;
        String address;
        long salary = 0;
        
        boolean check = false;
        
        //code
        do {
            System.out.print("Enter code: ");
            code = sc.nextLine();
            
            if (code.length() == 0)
                System.out.println("Employee code cannot empty");
            else if (!code.matches("^SE\\d{6}$"))
                System.out.println("you entered the wrong employee code format");
            else
                check = true;
            
        } while (check == false);
        
        check = false;
        
        //fulname
        do {
            System.out.print("Enter FullName: ");
            fullName = sc.nextLine();
            
            if (fullName.length() == 0)
                System.out.println("Employee FullName cannot be empty");
            else if (fullName.length() < 4)
                System.out.println("Fullname with at least 4 characters");
            else 
                check = true;
        } while (check == false);
        
        check = false;
        //age
        do {
            System.out.print("Enter age: ");
            
            try {
                age = Integer.parseInt(sc.nextLine());
                if (age < 24 || age > 45)
                    System.out.println("Age from 24 to 45");
                else
                    check = true;
            } catch (Exception ex) {
                System.out.println("you entered the wrong employee age format");
            }
        } while (check == false);
        
        check = false;
        //address
        do {
            System.out.print("Enter address: ");
            address = sc.nextLine();
            
            if (address.length() == 0)
                System.out.println("Employee address cannot be empty");
            else if (address.length() < 20)
                System.out.println("Address with at least 20 characters");
            else 
                check = true;
        } while (check == false);
        
        check = false;
        //salary
        do {
            System.out.print("Enter salary: ");
            
            try {
                salary = Long.parseLong(sc.nextLine());
                
            } catch (Exception ex) {
                System.out.println("You enter the wrong salary format");
            }
            
            if (salary  < 5000000 || salary > 20000000)
                System.out.println("Salary from 5000000 to 20000000");
            else 
                check = true;
        } while (check == false);
        
        Employee emp = new Employee(code, fullName, age, address, salary);
        System.out.println(emp);
    }
}
