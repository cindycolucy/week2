package week2.oop;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//create a variable called myCalc
		Calculator2 myCalc = new Calculator2();
		
		//print 0
		updateDisplay(0);
		
		//create an int called myDisplayValue = method called pushNumbers
		int newDisplayValue = myCalc.pushNumbers(42);
		//print myDisplayValue
		updateDisplay(newDisplayValue);
		
		myCalc.pushAdd();
		
		newDisplayValue = myCalc.pushNumbers(44);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushMinus();
		
		newDisplayValue = myCalc.pushNumbers(63);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushMinus();
		
		newDisplayValue = myCalc.pushNumbers(7);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushMult();
		
		newDisplayValue = myCalc.pushNumbers(2);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushDivide();
		
		newDisplayValue = myCalc.pushNumbers(2);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		

	}
public static void updateDisplay(int value){
	System.out.println(value);
}
}
