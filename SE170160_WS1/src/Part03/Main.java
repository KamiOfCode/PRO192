
package Part03;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Enter amount: ");
        n = sc.nextInt();
        
        String[] list = new String[n];
        System.out.println("List: ");
        
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        
        for (int j = 0; j < n; j++) {
            list[j] = list[j].toUpperCase();
            System.out.println(list[j]);
        }
    }
}
