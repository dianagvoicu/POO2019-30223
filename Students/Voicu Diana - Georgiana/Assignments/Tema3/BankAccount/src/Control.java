
public class Control {
	public static void main (String[] args){
	Bank bank = new Bank();
	int index=1;
	Account test1 = new Account(100);
	SavingsAccount test2 = new SavingsAccount(10,200); 
	CurrentAccount test3 = new CurrentAccount(-200,300);
	test1.print();
	test2.print();
	test3.print();
	
	Account a1 = bank.openAcc(1,index);
	index++;
	Account a2 = bank.openAcc(2,index);
	index++;
	Account a3 = bank.openAcc(3,index);
	index++;
	
	a1.print();
	a1.deposit(200);
	System.out.println("Acum Balance este = "+a1.getBalance());
	a1.withdraw(300);
	System.out.println("Acum Balance este = "+a1.getBalance());
	bank.updateAcc(1,0);
	bank.depositDivident(30, 1);
	System.out.println("Acum Balance este = "+a1.getBalance());
	
	a2.print();
	a2.deposit(500);
	a2.withdraw(200);
	System.out.println("Acum Balance este = "+a2.getBalance());
	bank.updateAcc(2, 50);
	bank.depositDivident(20, 2);
	a2.print();
	
	a3.print();
	a3.deposit(200);
	a3.withdraw(300);
	bank.updateAcc(3, 0);
	a3.withdraw(600);
	bank.updateAcc(3, 0);
	a3.print();
	
	bank.closeAcc(1);
	bank.closeAcc(2);
	bank.closeAcc(3);
	
	
	
	
	}
}

