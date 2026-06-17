package com.exceptions.in;


class InvalidAgeOfVehcileException extends Exception{
	public InvalidAgeOfVehcileException(String msg) {	
		super(msg);
	}
	
}

class InvalidAgeOfTireException extends Exception{
public InvalidAgeOfTireException(String msg) {
	super(msg);
	}
}

class InvalidAgeOfEngineException extends Exception{
public InvalidAgeOfEngineException(String msg) {
	super(msg);
	}
}

class Vehcile{
	public void checkage(int ageOfVehcile , int ageOffire , int ageOfEngine) {
		if(ageOfVehcile > 10) {
			throw new InvalidAgeOfVehcileException("Invalid age")
		}
		else if
	}
}

public class Example {
	
	
	
	public static void main(String[] args) {
		
	}
}
