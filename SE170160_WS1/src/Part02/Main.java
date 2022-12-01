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
public class Main {
    public static void main(String[] args) {
        float a, b;
        String op;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input the number 1: ");
        a = sc.nextFloat();
        
        System.out.print("Input the number 2: ");
        b = sc.nextFloat();
        
        System.out.print("Input the operator: ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        
        if (op.equals("+")) {
            System.out.println("The result of " + a + " " + op + " " + b + " = " + (a + b));
        }
        if (op.equals("-")) {
            System.out.println("The result of " + a + " " + op + " " + b + " = " + (a - b));
        }
        if (op.equals("*")) {
            System.out.println("The result of " + a + " " + op + " " + b + " = " + (a * b));
        }
        if (op.equals("/")) {
            System.out.println("The result of " + a + " " + op + " " + b + " = " + (a / b));
        }
        if (op.equals("%")) {
            System.out.println("The result of " + a + " " + op + " " + b + " = " + (a % b));
        }
    }
}
