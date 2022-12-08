/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part01;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Main {
    public static void main(String[] args) {
        boolean cont = false;
        
        do {
            try {
                String id;
                String pattern = "SE[0-9]{3}";
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the string: ");
                id = sc.next();
                if (!id.matches(pattern))
                    throw new Exception();
                System.out.println("The string is " + id);
                cont = false;
            } catch (Exception ex) {
                System.out.println("The string is invalid");
                cont = true;
            }
        } while (cont);
    }
}
