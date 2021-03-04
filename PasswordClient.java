/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordstrength;
import java.util.Scanner;

/**
 * Client class for our password
 * // Code is similar to Mehmet Ozen but a little different
 * // I might still add more to my code
 * @author Robert
 */
public class PasswordClient {
    public static void main(String[] args) {
        // This is where we will create the scanner for the program
        Scanner inPut = new Scanner (System.in);

        // This is where the program will call the checker
        StrengthChecker checker = new StrengthChecker();
        
        System.out.println("The Password: ");
        String password = inPut.nextLine();
        
        if(checker.checkForPassword(password )) {
            System.out.println("This is a great Password!!!!");
        }
        else {
            int check = 1;
            while (check ==1) {
                System.out.println("Does your password have 10 characters in it?");
                System.out.println("Does your password have any sort of spacing in it?");
                System.out.println("Does your password have 4 uppercase letters?");
                System.out.println("Does your password have 4 lowercase letters?");
                System.out.println("Does your password have 2 digits?");
                System.out.println();
                System.out.println("Please Try Again: ");
                password = inPut.nextLine();
                if(checker.checkForPassword(password)) {
                    check = 0;
                    System.out.println("This Password is Good to Go!");
                }
            } // close while
        } // close if/else
        
    } // close main  
} // close class
