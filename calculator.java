package calculator;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		System.out.println("Welcome to Programmer's Calculator!");
        System.out.println("Enter the number corresponding to the math functions you want to perform:");
        System.out.println("1) addition");
        System.out.println("2) subtraction");
        System.out.println("3) multiplication");
        System.out.println("4) division");
        System.out.println("5) increment");
        System.out.println("6) decrement");
        System.out.println("7) convert binary to decimal");
        
        System.out.println("(Your output will be given to you in decimal and binary!)");
      
        Scanner keyboard = new Scanner(System.in);
        int myInt = keyboard.nextInt();
        
        if(myInt == 1) {
            System.out.println("Enter your first binary number");
            Scanner input = new Scanner( System.in );
       	 	String myInt1 = input.nextLine();
            
            System.out.println("Enter your second binary number");
            Scanner input1 = new Scanner( System.in );
            String myInt2 = input1.nextLine();
            
            
            int myInt1a = Integer.parseInt(myInt1, 2);
            int myInt2a = Integer.parseInt(myInt2, 2);
            int output = (myInt1a+myInt2a);
            System.out.println("Output in Decimal --> " + output);
            System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

        } else if(myInt == 7) {
        	System.out.println("Enter your binary number");
        	 Scanner input = new Scanner( System.in );
        	 String myInt1 = input.nextLine();
        	 int output = Integer.parseInt(myInt1, 2);
        	 System.out.println("Output in Decimal --> " + output);
             System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

        } else if(myInt == 2) {
            System.out.println("Enter your first binary number");
            Scanner input = new Scanner( System.in );
       	 	String myInt1 = input.nextLine();
            
            System.out.println("Enter your second binary number");
            Scanner input1 = new Scanner( System.in );
            String myInt2 = input1.nextLine();
            
            
            int myInt1a = Integer.parseInt(myInt1, 2);
            int myInt2a = Integer.parseInt(myInt2, 2);
            int output = (myInt1a-myInt2a);
            System.out.println("Output in Decimal --> " + output);
            System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

       } else if(myInt == 3) {
           System.out.println("Enter your first binary number");
           Scanner input = new Scanner( System.in );
      	 	String myInt1 = input.nextLine();
           
           System.out.println("Enter your second binary number");
           Scanner input1 = new Scanner( System.in );
           String myInt2 = input1.nextLine();
           
           
           int myInt1a = Integer.parseInt(myInt1, 2);
           int myInt2a = Integer.parseInt(myInt2, 2);
           int output = (myInt1a*myInt2a);
           System.out.println("Output in Decimal --> " + output);
           System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

      } else if(myInt == 4) {
          System.out.println("Enter your first binary number");
          Scanner input = new Scanner( System.in );
     	 	String myInt1 = input.nextLine();
          
          System.out.println("Enter your second binary number");
          Scanner input1 = new Scanner( System.in );
          String myInt2 = input1.nextLine();
          
          
          int myInt1a = Integer.parseInt(myInt1, 2);
          int myInt2a = Integer.parseInt(myInt2, 2);
          int output = (myInt1a/myInt2a);
          System.out.println("Output in Decimal --> " + output);
          System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

     } else if(myInt == 5) {
         System.out.println("Enter your first binary number");
         Scanner input = new Scanner( System.in );
    	 	String myInt1 = input.nextLine();
                  
         
         int myInt1a = Integer.parseInt(myInt1, 2);
         int output = (myInt1a + 1);
         System.out.println("Output in Decimal --> " + output);
         System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

    } else if(myInt == 6) {
        System.out.println("Enter your first binary number");
        Scanner input = new Scanner( System.in );
   	 	String myInt1 = input.nextLine();
        
        
        
        int myInt1a = Integer.parseInt(myInt1, 2);
        int output = (myInt1a - 1);
        System.out.println("Output in Decimal --> " + output);
        System.out.println("Output in Binary --> " + Integer.toBinaryString(output));

   } else {
       System.out.println("Invalid Input");

   }
        
    }
}
