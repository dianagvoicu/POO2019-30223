
public class Bank {
	public Account[] account = new Account[5000];
	
	public Account openAcc(int tip, int index) {
		if(tip == 1) {
			account[index]= new Account(index);
		}
		else if(tip == 2) {
			account[index]= new SavingsAccount(0,index);
		}
		else if(tip == 3) {
			account[index]= new CurrentAccount(-300,index);
		}
		else {
			System.out.println("Numarul introdus nu reprezinta un tip corect de cont.");
		}
		return account[index];
	}
	
	public void updateAcc(int index, int adder) {
			if(index == 2) {
				((SavingsAccount) account[index]).addInterest(adder);
			}
			else if(index == 3) {
				double currentBalance= account[index].getBalance();
				int limit= ((CurrentAccount)account[index]).getOverdraftLimit();
				if(currentBalance < 0 ){
					if(currentBalance > limit) {
						System.out.println("Warning: Aveti Overdraft si mai aveti " + (-limit+currentBalance) + " pana sa ajungeti la limita.");
					}
					else{
						System.out.println("Letter sent. Ati atins/ depasit limita de overdraft. Nu mai puteti efectua retrageri.");
					}
				}
			}
		}
	
	public void depositDivident(double divident,int index) {
		account[index].deposit(divident);
	}
	public void closeAcc(int index) {
		System.out.println("Contul nr. " + index + " a fost inchis.");
	}
}
