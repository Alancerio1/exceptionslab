package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();
        
        String firstName = JOptionPane.showInputDialog("Enter in your first name");
        if(firstName.isEmpty()|| firstName == null){
             throw new IllegalArgumentException("You must enter in a name");
             
        }
        String lastName = JOptionPane.showInputDialog("Enter your last name");
         if(lastName.isEmpty()|| lastName == null){
             throw new IllegalArgumentException("You must enter in a lastname");
        }
        String reLastName = JOptionPane.showInputDialog("Renter your last name");
         if(reLastName.isEmpty()|| lastName == null){
             throw new IllegalArgumentException("You must reenter our last name");
        }
       if(lastName.equals(reLastName)){
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
       }else {
           throw new IllegalArgumentException("Last names did not match");
       }
    }
    


}
