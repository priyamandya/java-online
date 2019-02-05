package com.skillrary.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		
		String str="File handling in java using"+ "FileWriter and FileReader";
		
		FileWriter fw=new FileWriter("C:\\Users\\Sharath\\Desktop\\java online\\Basics\\vishal.txt");
		
		
		//read character wise from string and write  into FileWriter
		
		for(int i=0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}
		System.out.println("writing is succesfull");
		fw.close();
	}

}
