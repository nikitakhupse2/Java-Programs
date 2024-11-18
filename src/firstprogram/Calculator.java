package firstprogram;

public class Calculator {
	
	int mrp = 999;
	String name = "Casio";
	
	void addTwo(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		//Create an instance of the Calculator class
		Calculator c1 = new Calculator();
		
		//call the addTwo method
		c1.addTwo(5,4);
	}
}
