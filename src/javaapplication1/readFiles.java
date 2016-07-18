/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Rebecca
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;

public class readFiles {
    
   // private static final List<String> rockPaperScissor = new ArrayList<>();
    
    public static void main(String args[]) 
      {
        File file = new File("C:\\Users\\Rebecca\\Documents\\NetBeansProjects\\JavaApplication1\\files\\rockpaperscissors.txt");
       // String text = readString(file);
        //System.out.println(file);
        
        String[] words = readArray(file);
        for(int i = 0; i < words.length; i = i +1){
            System.out.println(words[i]);
        }
       
      }
        
    public static String[] readArray(File file){      
          try {  
            int counter = 0;  
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                counter = counter + 1;
                scanner.next();
            }
            String [] words = new String[counter];
            
            Scanner scanner2 = new Scanner(file);
            for (int i = 0; i < counter; i = i +1){
                words[i] = scanner2.next();
            }
              return words;
              /*while(scanner.hasNextLine()){
                  String[] lines = scanner.nextLine().split("\\s+");
                  for (String line : lines){
                      rockPaperScissor.add(line);
                  }
                  System.out.println(rockPaperScissor);
              }  */
            
              
        } catch (FileNotFoundException e) {
        }   return null;
    }
}