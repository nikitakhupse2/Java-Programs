package firstprogram;
import java.util.*;
public class Improcalculator2 {

	int addTwo(int a, int b) {
		return a+b;
	}
	
	
	int avgofTwo(int a, int b) {
		int sum = addTwo(a, b);
		return sum/2  ;
	}
	
	double discon(int a, int b) {
		int avg = avgofTwo(a,b);
		return avg * 0.1;
	}
	
	
	
	public static void main(String[] args) {
		//Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);
		
		Improcalculator2 c = new Improcalculator2();
		double z= c.discon(10, 10);
		System.out.println(z);
	}
}
