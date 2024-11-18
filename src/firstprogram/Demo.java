package firstprogram;

public class Demo {
	
	int m1(int a) {
		return a*2;
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
		int result = d1.m1(5);
		System.out.println(result);
	}
}
