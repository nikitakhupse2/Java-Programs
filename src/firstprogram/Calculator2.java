package firstprogram;
//Calculator has discount operation which accepts two numbers from user and compute 10% discount on average result
public class Calculator2 {
	int sumoftwo(int a, int b) {
		int sum = a+b;
		return sum;
	}
	int avgoftwo(int a, int b) {
		Calculator2 c = new Calculator2();
		int sum = c.sumoftwo(a, b);
		int avg = sum/2;
		return avg;
	}
	void dicount() {
		Calculator2 c = new Calculator2();
		double avg = c.avgoftwo(10, 10);
		double disc = avg * 0.1;
		System.out.println("discount is:"+disc);
		
	}
	public static void main(String[] args) {
		Calculator2 c = new Calculator2();
		int sum = c.sumoftwo(10,10);
		System.out.println("sum of two numbers:" +sum);
		int avg = c.avgoftwo(10,10);
		System.out.println("avg of two numbers:" +avg);
		c.dicount();
	}

	
}
