package com.exceptions.in;

class InvalidMobNum extends Exception{
	public String Bunty() {
		return "Invalid Mobile Num";
	}
}
public class MobileNum {

	public static void main(String[] args) {
		
		String mobile = "6281062184";
		
		try {
			if(mobile.length()!=10 || !mobile.matches("[6-9]\\d{9}")) {
				throw new InvalidMobNum();
			}
			System.out.println("Valid Number");
		}
		catch(InvalidMobNum e) {
			System.out.println(e.Bunty());
		}
			
	}
}
