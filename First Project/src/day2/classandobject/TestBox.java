package day2.classandobject;

public class TestBox {

	public static void main(String[] args) {
		
		Box UPS = new Box();
		Box Fedex = new Box();
		
		UPS.length = 25;
		UPS.width = 10;
		UPS.calculateArea();
		
		Fedex.length = 10;
		Fedex.width = 12;
		Fedex.calculateArea();
		

	}

}
