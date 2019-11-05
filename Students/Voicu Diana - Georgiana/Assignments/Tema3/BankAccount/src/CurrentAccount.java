
public class CurrentAccount extends Account {
	private int overdraftLimit;
	
	public CurrentAccount(int overdraftLimit,int number) {
		super(number);
		this.overdraftLimit= overdraftLimit;
	}	
	public int getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimit(int newOverdraftLimit) {
		this.overdraftLimit = newOverdraftLimit;
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
		return "Account " + getNumber() + ": " + "balance = " + getBalance() + ", " + "Overdraft Limit = " + getOverdraftLimit();
	}
	

}
