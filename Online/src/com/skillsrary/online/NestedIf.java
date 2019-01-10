package com.skillsrary.online;

import java.util.Scanner;
//Atm interactive program
public class NestedIf {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		
		int accbal=5000;
		Scanner sc=new Scanner(System.in);// to make interactive to read the values from the keyboard
		System.out.println("enter the pin");
		int pin=sc.nextInt();
		if(pin==777) {
			System.out.println("please enter the ammount to be withdrawen");
			int amt=sc.nextInt();
			if(amt<accbal) {
				System.out.println("succesfuly withdrawn");
				accbal=accbal-amt;
				System.out.println("account balance is "+accbal);
			}else {
				System.out.println("Insuffecient balance");
			}
		}
		else {
	System.out.println("Invalid pin no");
		
	}
	}
}


