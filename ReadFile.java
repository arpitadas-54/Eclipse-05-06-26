package com.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		try {
		File myObj1 = new File("C:\\Coforge\\Arpita.txt");
		Scanner myReader = new Scanner(myObj1);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
 
	} catch (FileNotFoundException e) {
		System.out.println("An error occured");
	}

}
}

