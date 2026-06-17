package com.exceptions.in;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			int a = 10/0;
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("End");

	}

}
