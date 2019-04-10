package core.java;

public class execution {
	public static void main(String[] args) {
		//computer
		//Object Creation Of A Class
	Computer refVar1 = new Computer();
	//Class Name + reference variable = new + Constructor name
	refVar1.model = "Asus";
	System.out.println(refVar1.year);
	System.out.println(refVar1.model);
	Computer refVar2 = new Computer (2019);
	Computer refVar3 = new Computer ("Mac");
	System.out.println(refVar1.display);
	System.out.println(Computer.keys);
	
	

		//Math method
    	Math math = new Math();
		int newValue = math.calculator1(7,8);
		int newValue3 = math.calculator1(7, 98);
		System.out.println(newValue);
	
		int newValue2 = Math.calculator2(10,5);
		System.out.println(newValue2);
		
		
	}

}
