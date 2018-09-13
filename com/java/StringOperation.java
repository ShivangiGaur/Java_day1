package com.java;

import java.util.Scanner;

public class StringOperation {
	public static String s;


	public static void addString(){
		String added = s + " " + s; 
		System.out.println(added);
	
	}
	
	public static void replaceOddPositions(){
		for (int i=0; i < s.length(); i++){
	        if (i % 2 != 0){
	          s = s.substring(0,i-1) + "#" + s.substring(i, s.length());
	        }
	      }
	}
	
	public static void removeDuplicate(){
		
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner( System.in );
		 
        int operationID;
       
 
        System.out.println("1. Add the string to itself");
        System.out.println("2. Replace odd positions with #");
        System.out.println("3. Remove duplicate characters in the String");
        System.out.println("4. Change odd characters to upper case");
        System.out.println();
        System.out.println("Enter number (or 0 to exit)");
        
        
        operationID = scanner.nextInt();
        
        
        System.out.print("Enter the string: ");
        s = scanner.next( );
        /*System.out.println("Enter string:");
        String input = scanner.nextLine();*/
       
        
		switch(operationID){
		case 1:
			addString();
			
			break;

		case 2:
			replaceOddPositions();
			
			break;

		case 3:
			
			break;

		case 4:
			
			break;
		}

	}

}
