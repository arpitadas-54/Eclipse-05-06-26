package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Coforge\\Arpita.txt");
			myWriter.write("You go girl!");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		} catch (IOException e) {
			System.out.println("An error");
			e.printStackTrace();
		}

	}

}

