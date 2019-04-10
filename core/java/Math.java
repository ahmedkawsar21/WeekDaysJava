package core.java;

public class Math {
	// Non Static Method -void
	public void getAddress() {
		System.out.println("My Address Is......");
		
	}	
		
	public void calculator3 (int a, int b)	 {
		
	}
	
	// Static Method -void
	// When we have static we just use classname
	// when we do not have static we use refvariable
	public static void getTime() {
		System.out.println("Current Time IS......");
		
	}
		
	
	
	// Non Static Method - return
		public int calculator1(int a, int b) {
			int total = a+b;
			return total;
	}
		
		public String calculator1(String a, String b) {
			String total = a+b;
				return total;
	}
	
	// Static Method - return
		public static int calculator2(int a, int b) {
			int total = a-b;
				return total;
				
	}

		
			
				
		
		

}
