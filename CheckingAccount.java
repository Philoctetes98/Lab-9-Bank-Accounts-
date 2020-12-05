//This is the derived class which represents a checking account
public class CheckingAccount extends BankAccount {
	//represents the cost for clearing a check
	public static final double FEE = 0.15;
	//Constructor
	public CheckingAccount(String name, double amount) {
		//calls the BankAccount constructor and initializes
		// the name of the checking account holder 
		// and the initial amount in the account
		super(name,amount);
		//Concatenates -10 to the Account Number
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	//Overridden method which takes the amount to withdraw and 
	//adds it to the fee for check clearing
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
	

}
