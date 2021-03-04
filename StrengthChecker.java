/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;

/**
 * Tool class for evaluating candidate password strength against a set of requirement
 * @author Robert
 */
public class StrengthChecker {
    
    public boolean checkForPassword(String password) {
        
    return checkForPasswordLength(password) && checkForSpaces(password) && checkForUpperCase(password) &&
            checkForLowerCase(password) && checkForDigits(password);

    } // close method
    
    public boolean checkForPasswordLength(String password) {
        if(password.length() > 7) {
            return true;
        } else {
            System.out.println("You need at least 10 characters in your password");
            System.out.println();
            return false;
        } // close if/else
        
    } // close checkForPasswordLength
    
    public boolean checkForSpaces(String password) {
        String req = ".*\\s.*";
        if(password.matches(req)) {
            System.out.println("There are no spaces allowed in this password.");
            System.out.println();
            return false;
        } else {
            return false;
        } // close if/else
        
    } // close checkForSpaces
    
    public boolean checkForUpperCase(String password) {
        String req = ".*\\p{Upper}.*";
        if(password.matches(req)) {
            return true;
        } else {
            System.out.println("Have at least 4 uppercase letters.");
            System.out.println();
            return false;
        } // close if/else
        
    } // close checkForUpperCase
    
    public boolean checkForLowerCase(String password) {
        String req = ".*\\p{Lower}.*";
        if(password.matches(req)) {
            return true;
        } else {
            System.out.println("Have at least 4 lowercase letters.");
            System.out.println("");
            return false;
        } // close if/else
        
    } // close checkForLowerCase
    
    public boolean checkForDigits(String password) {
        String req = ".*\\d.*";
        if(password.matches(req)) {
            return true;
        } else {
            System.out.println("Have at least 2 digits in your password.");
            System.out.println();
            return false;
        } // close if/else
        
    } // close checkForDigits
    
} // close class
