package Lab4;

public class Account {
	long accNum;
	double balance;
	Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
		accNum ++;
		
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getAccHolder() {
		return accHolder;
	}


	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}


	void deposit(){
		
	}
	
	void withdraw(){
		
	}
	
	double getUpdatedBalance(){
		return accNum;
		
		
	}
	
public Account(String name, double amt) {
		
		accHolder = new Person();
		accHolder.setName(name);
		balance = amt;
		accNum++;
	}
	
void deposit(double amt) {
		
		balance+=amt;
	}
	
	boolean withdraw(double amt) {
		
		double temp = balance;
		temp -= amt;
		
		if (temp < 500) {
			System.out.println("Ensure minimum balance of INR 500 in your account. Please withdraw a smaller amount."); 
			return false;
		}
		balance = temp;
		return true;
	}
	

	public static void main(String[] args) {
		Account ac1 = new Account("Smith", 2000);
		Account ac2 = new Account("Kathy", 3000);
		
		ac1.deposit(2000);
		boolean check = ac2.withdraw(4000);
		
		String bal1 = ac1.toString();
		String bal2 = ac2.toString();
		
		System.out.println(bal1);
		System.out.println(bal2);
	}

}
