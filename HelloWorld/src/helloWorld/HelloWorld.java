package helloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		String feels = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello");
		System.out.println("Who am I speaking with?");
		String name = scan.nextLine();
		System.out.println("Hello " + name + "!"); 
		
		do {
			System.out.println(name + ", how are you doing today?");
			System.out.println("[Good] [Bad] [Ok]");
			Scanner scan2 = new Scanner(System.in);
			feels = scan2.nextLine();
			if (!feels.equalsIgnoreCase("good") || !feels.equalsIgnoreCase("bad")
					|| !feels.equalsIgnoreCase("ok")){
				break;
			} else {
				System.out.println("I don't understand you.");
			}	
		} while (
			
	if ( !feels.equalsIgnoreCase("good") ){
		System.out.println("Im glad you're feeling good!");
					
	}else if (!feels.equalsIgnoreCase("bad")){
		System.out.println("I hope you feel better!");
					
	}else{
		System.out.println("I'm sure you'll feel better soon enough.");
	}
	}
}


