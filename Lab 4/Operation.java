package Lab4;

public class Operation {
	void sub(int a, int b){
		
	}

	void add(int a, int b){
		
		System.out.println(a+b);
	}
	void add (int a, double b){
		System.out.println(a+b);	
	}
	
	
	
	public static void main(String[] args) {
		Operation op = new Operation();
		Operation op1 = new Operation();
		op.add(3,4);
		op.add(3, 4.4f);
	}
}

