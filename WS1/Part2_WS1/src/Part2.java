
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lehuu
 */
public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float num1, num2;
        String op;
        
        System.out.print("Input the number 1: ");
        num1 = sc.nextFloat();
        
        System.out.print("Input the number 2: ");
        num2 = sc.nextFloat();
        
        System.out.print("Input the operator: ");
        sc = new Scanner (System.in);
        op = sc.nextLine();
        
        if (op.equals("+")) {
            System.out.println("The result of " + num1 + op + num2 + " = " +(num1 + num2));
        }
        
        if (op.equals("-")) {
            System.out.println("The result of " + num1 + op + num2 + " = " +(num1 - num2));
        }
        
        if (op.equals("*")) {
            System.out.println("The result of " + num1 + op + num2 + " = " +(num1 * num2));
        }
        
        if (op.equals("/")) {
            System.out.println("The result of " + num1 + op + num2 + " = " +(num1 / num2));
        }
    }
}