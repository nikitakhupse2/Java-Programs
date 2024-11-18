package firstprogram;

//Calcultor has avg operation which accepts two numbers from user and disply avg result on console

public class Calculator1 {
	
	int addTwo(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	 void avgoftwono() {
		Calculator1 c = new Calculator1();
		int res = c.addTwo(10, 10);
		int average = res/2;
		System.out.println("average of two numbers:"+average);
	}

	 
	 
	public static void main(String[] args) {
		
		Calculator1 c = new Calculator1();
		c.avgoftwono();
	}

}
