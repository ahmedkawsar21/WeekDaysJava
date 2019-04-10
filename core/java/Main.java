package core.java;

public class Main {

	public static void main(String[] args) {
		Account kawsarsAccount = new Account("12345", 0.00, "Kawsar Ahmed", "myemail@gmail.com", 
				"(347) 339-8081");
		
		System.out.println(kawsarsAccount.getNumber());
		System.out.println(kawsarsAccount.getBalance());
		
		kawsarsAccount.Withdrawl(100.00);
		
		kawsarsAccount.deposit(50.00);
		kawsarsAccount.Withdrawl(100.00);
		
		kawsarsAccount.deposit(51.00);
		kawsarsAccount.Withdrawl(100.00);
		
		
		
		


	}

}
