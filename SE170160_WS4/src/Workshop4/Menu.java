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
public class Menu {
    public static int getChoice(ArrayList menu) {
        System.out.println("===============================");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " + menu.get(i));
        }
        
        System.out.print("choice 1 .... " + menu.size() + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    
    public static int getChoice(Object[] menu) {
        System.out.println("===============================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        
        System.out.print("choice 1 .... " + menu.length + ": ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
