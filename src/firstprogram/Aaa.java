package firstprogram;

public class Aaa {
	
	Zzz m1(int a) {
		Zzz obj = new Zzz();
		return obj; 
	}

	public static void main(String[] args) {
		Aaa var = new Aaa();
		Zzz p =var.m1(10);
		System.out.println(p);//Address
	}
}
