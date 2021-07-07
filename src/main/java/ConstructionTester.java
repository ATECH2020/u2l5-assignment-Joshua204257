import java.util.Scanner;
 
public class ConstructionTester
{
   public static void main(String[] args)
   {  
       //Variables
       double taxRate;
       int numBoards;
       int numWindows;
       double boardCost = 8;
       double windowCost = 11;
       double total = 0;
       double grandTotal = 0;
 
       //Scanner Initiation
       Scanner myScanner = new Scanner(System.in);
      
       //Prompts
       System.out.println("Enter the sales tax rate: ");
       taxRate = myScanner.nextDouble();
 
       System.out.println("How many boards do you need?");
       numBoards = myScanner.nextInt();
 
       System.out.println("How many windows do you need?");
       numWindows = myScanner.nextInt();
 
       //Construction References
       Construction myConstruction = new Construction(boardCost,windowCost, taxRate);
       total += myConstruction.lumberCost(numBoards);
       total += myConstruction.windowCost(numWindows);
       grandTotal += myConstruction.grandTotal(total);
 
       //Printing
       System.out.println("Total: " + total);
       System.out.print("Grand Total: " + grandTotal);
      
   }
}
