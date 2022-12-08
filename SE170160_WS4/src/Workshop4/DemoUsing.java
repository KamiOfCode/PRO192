/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Workshop4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author win
 */
public class DemoUsing {
    public static void main(String[] args) {
        I_Manage i = (I_Manage) new Manage();
        
        List<FullTime> list1 = new ArrayList<>();
        List<PartTime> list2 = new ArrayList<>();
        
        String[] menu = {"Add new Fulltime employee", "Add new Parttime employee", "Print all Fulltime employee", "Print all Parttime employee", "Quit"};
        int choice;
        do {
            choice = Menu.getChoice(menu);
            switch(choice) {
                case 1:
                    i.AddFullTime((ArrayList<FullTime>) list1);
                    break;
                case 2:
                    i.AddPartTime((ArrayList<PartTime>) list2);
                    break;
                case 3:
                    i.DisFullTime((ArrayList<FullTime>) list1);
                    break;
                case 4: 
                    i.DisPartTime((ArrayList<PartTime>) list2);
                    break;
                case 5:
                    break;
            }
        } while (choice>0 && choice<menu.length);
    }
}
