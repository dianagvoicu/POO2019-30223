
public class SavingsAccount extends Account {
	private int interest;
	
	
	public SavingsAccount(int interest, int number) {
		super(number);
		this.interest = interest;
	}
	
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	public int getInterest (){
		return interest;
	} 
	
	public void addInterest(int adder ) {
		if(adder != 0) {
			interest += adder;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int newNumber) {
		this.number= newNumber;
	}
	
	@Override
	
	public String toString() {
		return "Account " + getNumber() + ": " + "balance = " + getBalance() + ", " + "interest = " + getInterest();
	}
	
	
}
