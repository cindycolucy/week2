package week2.loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String porridgeTemperature;
		do {
		  System.out.println("Please specify porridge temperature.");
		  System.out.println("Type \"help\" to list options.");
		  porridgeTemperature = input.nextLine();
		  if(porridgeTemperature.equals("help")) {
		    System.out.println("Options: too hot, too cold, just right");
		  }
		} while(porridgeTemperature.equals("help"));
		
		
		input.close();
	}

}
