package day1.exercises;

public class Exercise2 {

	public static void main(String[] args) {

		String[] nums = {"10", "20" , "30", "40"};

		int total = 0;
		
		for(String temp : nums){
			total = total + Integer.parseInt(temp);			
		}
		System.out.println("Total = " + total);
	}

}
