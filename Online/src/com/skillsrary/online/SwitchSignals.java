package com.skillsrary.online;

import java.util.Scanner;

public class SwitchSignals {

	public static void main(String[] args) {
		
		System.out.println("programs starts");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("show signals");
		String color=sc.next();
		
		switch(color) {
		case "red":System.out.println("stop the vehicle");
		break;
		case "green":System.out.println("ready to gooo");
		break;
		case "yellow":System.out.println("get ready.....!");
		break;
		default:System.out.println("oops your in wrong way");
		
		}

	}

}
