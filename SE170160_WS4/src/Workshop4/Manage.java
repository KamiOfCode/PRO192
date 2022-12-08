/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author win
 */
public class Manage implements I_Manage{

    @Override
    public void AddFullTime(ArrayList<FullTime> list) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        String code;
        System.out.println("Input all information");
        do {
            System.out.print("Input code: ");
            code = sc.nextLine();
            if (code.matches("^FS\\d{5}$")) {
                System.out.println("Code is valid");
                c = false;
            } else {
                System.out.println("Code is invalid");
            } 
        } while (c == true);
        
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.print("Input address: ");
        String address = sc.nextLine();
        System.out.print("Input department: ");
        String department = sc.nextLine();
        int salary = 0;
        do {
            try {
                System.out.print("Input salary: ");
                salary = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (c == true || salary < 1500);
        int absent = 0;
        do {
            try {
                System.out.print("Input absent: ");
                absent = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (c == true || absent < 0);
        
        FullTime ef = new FullTime(salary, absent, code, name, phone, address, department);
        list.add(ef);
        System.out.println("Employee has been added!");
    }

    @Override
    public void AddPartTime(ArrayList<PartTime> list) {
        Scanner sc = new Scanner(System.in);
        boolean c = true;
        String code;
        System.out.println("Input all information");
        do {
            System.out.print("Input code: ");
            code = sc.nextLine();
            if (code.matches("^FS\\d{5}$")) {
                System.out.println("Code is valid");
                c = false;
            } else {
                System.out.println("Code is invalid");
            } 
        } while (c == true);
        
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        System.out.print("Input address: ");
        String address = sc.nextLine();
        System.out.print("Input department: ");
        String department = sc.nextLine();
        int wage = 0;
        do {
            try {
                System.out.print("Input wage: ");
                wage = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (c == true || wage < 10);
        int present = 0;
        do {
            try {
                System.out.print("Input present: ");
                present = Integer.parseInt(sc.nextLine());
                c = false;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        } while (c == true || present < 0);
        
        PartTime ep = new PartTime(wage, present, code, name, phone, address, department);
        list.add(ep);
        System.out.println("Employee has been added!");
    }

    @Override
    public void DisFullTime(ArrayList<FullTime> list) {
        System.out.println("====All employee work fulltime====");
        for (FullTime f : list)
            System.out.println(f);
    }

    @Override
    public void DisPartTime(ArrayList<PartTime> list) {
        System.out.println("====All employee work parttime====");
        for (PartTime p : list)
            System.out.println(p);
    }
    
}
