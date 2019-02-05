package com.skillrary.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) throws IOException {
		int ch;//variable declaration
		
		FileReader fr=new FileReader("C:\\Users\\Sharath\\Desktop\\java online\\Basics\\vishal.txt");
		
		
			while((ch=fr.read())!=-1) {
				System.out.println((char)ch);
			}
			fr.close();
	}

}
