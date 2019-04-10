package core.java;

public class Account {
	private String number;
	private double balance;
	private String customerName;
	private String  customerEmailAddress;
	private String customerPhoneNumber;
	
	public Account() {
		this("56879", 2.5, "Default name", "default address", "default phone");
		System.out.println("Empty Constructor called");
	}
	
	public Account(String number, double balance,String customerName, String customerEmailAddress,
			String customerPhonenumber) {
		System.out.println("Account constructor with parametrer called");
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	
	public void deposit (double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
				
	}
	 public void Withdrawl (double withdrawlAmount) {
		 if (this.balance - withdrawlAmount <0) {
			 System.out.println("Only " + this.balance + " avaiable. Withdrawl not proceeed");
		 } else  {
			 this.balance -= withdrawlAmount;
			 System.out.println("Withdrawl of " + withdrawlAmount + " proceed. Remaining balance = " +
			 this.balance);
		 }
			 
	 }

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	 
	 
	
	
	
	
}
