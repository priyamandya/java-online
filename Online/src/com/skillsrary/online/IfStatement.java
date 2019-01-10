package com.skillsrary.online;

public class IfStatement {

	public static void main(String[] args) {
		
		System.out.println("program starts");
		int accbal=5000;
		if(accbal<4000) {
			System.out.println("balance is 5000");
		}else if(accbal==5000) {
			System.out.println("ammount is withdraw");
		}else {
			System.out.println("Insufficient balance");
		}

	}

}
