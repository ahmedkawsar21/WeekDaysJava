package core.java;

import java.util.ArrayList;

public class Loops {

	public static void main(String[] args) {
	
		//Loops
		// for loops
		// write value of x 5 times
		// s 0 means this is where  my condition start
		// s<6 where my conditions ends
		
		for (int s = 0; s<5; s++
				) { //java set up on mind : 5 times times loop need to run
			
		
			System.out.println("I dont love java : And value of s is = " +s);

			
		}
		 //While loop
		int a = 0;
		while(a<5) {
			System.out.println("I dont love java : And value of s is = " +a);
			a++;
			
		}
		
		// enhanced for loop
		// create an array and insert 3 names
		String array[] = {"Kawsar", "Tasnuba", "Tania", "Nusrat"};
		System.out.println("length of array is " + array.length);
		for (String s: array) {
			System.out.println("my name is "+s);
		}
		
		//do while
		int z = 10;
		do {
			//System.out.println("my name is "+z);
			z++;
			
		}
		while (z<20);
		
		ArrayList <String> arraylist = new ArrayList<>();
		System.out.println(arraylist.size());
		for(int b=0; b<5; b++) {
			System.out.println(0);
		arraylist.add("Kawsar");
		}
		System.out.println(arraylist.size());
		System.out.println(arraylist.get(3));
		
			
		
	}

}
