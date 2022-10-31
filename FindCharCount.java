package week1.Day3;

public class FindCharCount {
	
	public static void main(String[] args) {
		
//	Find the count of given character in a String
//	String str = "cognizant";
//	char ch = 'c'; // 1
//	Goal: To understand the String, loop, if 
//	a) Create a class by name: FindCharCount (with main method) in same package
//	b) Write a logic to find the number of occurances of a given character
//	c) Run and Confirm the correct character count is printed in console
//	Hint: Convert the String to character array, loop and compare with the input charac
		
		

		String str = "Mystress";
		char ch = 's';
		int count = 0;
		
//		convert string to array
		char[] chars= str.toCharArray();
        for (int i=0;i<str.length();i++) {
		 if(ch == chars[i]) {
			 count++;			
		  }
	   }
    	System.out.println("Count of "+ch+" in " +str +": " +count);


	}

}
		
		
	
