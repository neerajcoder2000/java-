import java.io.File;

public class Handling_FileDirectory {

	public static void main(String[] args) {
		
		File file = new File("Java\\directory");
		
		boolean value = file.mkdir();
		
		if(value) {
			System.out.println("The new directory is created");
			
		}
		else {
			System.out.println("The directory already exists");
		}
		

	}

}
