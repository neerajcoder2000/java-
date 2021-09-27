import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Handling_File {

	public static void main(String[] args) {
		
		//code to create a new file
		/*
		File myFile = new File("C:\\Users\\DELL1\\Desktop\\java");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			System.out.println("unable to create this file");
			e.printStackTrace();
		}
		   */
        //code to write to a file
		/*
		
		try {
			FileWriter fileWriter = new FileWriter("C:\\Users\\DELL1\\Desktop\\java");
			fileWriter.write("This is our first file from this java course\n okay by now");
			fileWriter.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		*/
		
		//Reading a File
		/*
		File myFile = new File("C:\\Users\\DELL1\\Desktop\\java");
		try {
			Scanner sc = new Scanner(myFile);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		*/
		//Deleting a File
		
		File myFile = new File("C:\\Users\\DELL1\\Desktop\\java");
		if(myFile.delete()) {
			System.out.println("I have deleted: " +myFile.getName());
			
		}
		else {
			System.out.println("some problem occured while deleting the file");
		}
	}
        
}
