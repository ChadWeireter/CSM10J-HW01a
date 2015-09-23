/**
 *
 * @author Chad Weireter
 */

import java.io.*;
import java.util.Scanner;
import java.lang.String;

public class Hw01a {

    static Scanner console = new Scanner(System.in);
    
   
    public static void main(String[] args) throws IOException {
    
        FileReader in = null;
        Scanner inFile = new Scanner(new FileReader("stocks.txt"));
        
        System.out.println("Enter 1 to get price by stock ticker.");
        System.out.println();
        System.out.println("Enter 2 to get stocks greater than or equal to a specified price");
        System.out.println();
        System.out.println("Enter 3 to quit");
        System.out.println();
        System.out.println("Your choice: ");
        
       int choice = console.nextInt();
       
       switch(choice){
            case 1: System.out.println("Enter a stock ticker: ");
            
                String str = console.next();
                String str1 = inFile.next();
                double price = inFile.nextDouble();
                String str2 = inFile.next();
                double price2 = inFile.nextDouble();
                int tick = str.compareToIgnoreCase(str1);
                if(str.equals(str1))
                
                System.out.println(str1 + " current price is " + price);
                
                else 
                    tick = str.compareToIgnoreCase(str2);
                if(str.equals(str2))
                    System.out.println(str2 + " current price is " + price2);
                else
                    System.out.println("invalid");
                
                break;
                
            case 2: System.out.println("Enter a price: ");
                double priceInput = console.nextDouble();
                
                break;
                
            case 3: System.out.println("BYE");
                
            case 4: System.out.println("Unrecognized menu option, exiting now...");
        }
        
        
        
        
        
    }
    
}
