package com.files;

import java.io.File;
import java.io.IOException;

public class CreateFileDir {

	public static void main(String[] args) {
		try {
			File myObj = new File("C:\\Coforge\\Arpita.txt");
			
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				System.out.println("Absolute Path: " + myObj.getAbsolutePath());
			}else {
				System.out.println("File already exists.");
			}
		}catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
