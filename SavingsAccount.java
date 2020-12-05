//This is the derived class which represents a savings account
public class SavingsAccount extends BankAccount {
	//represents the annual interest rate
	private double rate = 2.5;
	//represents the Savings Account number
	private int savingsNumber = 0;
	//the account number
	private String accountNumber;
	
	//Constructor
	public SavingsAccount(String name, double amount) {
		//calls the BankAccount constructor and initializes
		// the name of the savings account holder 
		// and the initial amount in the account
		super(name, amount);
		//Concatenates the account number with a hyphen
		setAccountNumber(getAccountNumber()+"-" + savingsNumber);
	}
	// This method will calculate one month's worth of 
	// interest on the balance and deposit it into the account.
	public void postInterest() {
		//monthly interest
		rate = (rate/100)*12;
		//updated account balance
		setBalance((getBalance()*rate)+getBalance());
	}
	
	//Overridden method which creates and returns the savings account number
	@Override
	public String getAccountNumber() {
		savingsNumber+=1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		return accountNumber;
	}
	
	//Copy Constructor which creates another savings account for the same person
	public SavingsAccount(SavingsAccount s, double balance){
		//calls the copy constructor of the base class and initializes
		//with the savings account and starting balance
		super(s,balance);
		//assign the savingsNumber to be one more 
		// than the savingsNumber of the original savings account
		savingsNumber +=1;
		//It should assign the accountNumber to be the accountNumber of the superclass 
		// concatenated with the hypen and 
		// the savingsNumber of the new account.
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}
