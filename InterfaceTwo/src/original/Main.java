package original;

import java.util.Scanner;

public class Main {
	
		
		
	public static void main(String[] args) {
		
		
		System.out.println(computer.brand);
		System.out.println(computer.type);
		
		Scanner scan = new Scanner(System.in);
		InterfaceExampleTwo examp = new InterfaceExampleTwo();
		System.out.println("Type 'On' or 'Off'");
		while(true) {
			
		
		String userInput = scan.nextLine();
		examp.powerButton(userInput);
		
		
		
		
		}	
		
	}

	


}


