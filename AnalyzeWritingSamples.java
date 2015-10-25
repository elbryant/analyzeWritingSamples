/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyzesamples;

/**
 *
 * @author Erica Bryant
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnalyzeSamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new Scanner
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        //welcome users
        System.out.print("Welcome to Text Analysis \n");
        System.out.println();
        
        while (choice.equalsIgnoreCase("y")) {
            
            //ask user to enter text
            System.out.print("Please Enter Your Text:\t");
            String text = sc.nextLine(); //create a string that stores user's input
            
            //create an array, use spaces as guide to separate text, store in list
            List<String> separatedWords = Arrays.asList(text.split(" "));
            
            //create a hash table without duplicates
            Set<String> uniqueWords = new HashSet<String>(separatedWords);
        
            for (String word : uniqueWords) { //add each unique word to the word variable
            System.out.println("['" + word + "'," + Collections.frequency(separatedWords, word) + "]"); //print each word once with number of times it appears in list
            }
            
        //ask if user wants to enter more text
        System.out.print("\nWould You Like to Analyze More Text? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
 
        }
    }
}