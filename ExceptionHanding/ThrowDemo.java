package day1;

import java.io.FileNotFoundException;

class InvalidAgeException extends RuntimeException{
	
	public void isValid(int age) {
		//InvalidAgeException i = new InvalidAgeException();
		
		try {
			if(age<18) {
				
			    throw new  InvalidAgeException();
			    //throw i;     
		}
		else {
			System.out.println("Your age is Valid");
			}
		}
		catch(InvalidAgeException ie) {
			System.out.println("Your age is not Valid "+ie);
		}
		
		
	}	
	
}

public class ThrowDemo {

	public static void main(String[] args) {
		
		InvalidAgeException iae=new InvalidAgeException();
		iae.isValid(15);
		

	}

}
