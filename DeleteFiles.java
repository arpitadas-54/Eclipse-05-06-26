package com.files;

import java.io.File;

public class DeleteFiles {

	public static void main(String[] args) {
		File myObj = new File("C:\\Coforge\\Arpita.txt");
		if(myObj.delete()) {
			System.out.println("Delete the file: " + myObj.getName());
		} else {
			System.out.println("There is no such file to delete");
			
		}
		// TODO Auto-generated method stub

	}

}
