package day1.examples;

public class ExampleAndOr {

	public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y = -10;
		// && and
		// || or
		if(x > 0 && y > 0){
			System.out.println("Both nums are +ve");
		}else if(x > 0 || y > 0){
			System.out.println(" atleast one num is +ve");
		}else{
			System.out.println(" Both nums are -ve");
		}
			

	}

}
