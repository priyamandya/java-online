package com.skillrary.exceptions;

import java.util.Scanner;

public class InvalidAgeException extends RuntimeException{
	
public InvalidAgeException(String str) {
	System.out.println(str);
}
}
class Test{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			if(age>=60||age<=0) {
				//System.out.println("invalid age please enter the age between 1-60");
				throw new InvalidAgeException("Invalid age please enter age between1-59");
			}
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
		}
		System.out.println("Entered age is "+ age);
		
	}
}
