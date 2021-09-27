import java.io.File;
import java.io.IOException;

public class Handling_FileRename {

	public static void main(String[] args) {
		
		File file = new File("oldname");
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Creat a new file");
			e.printStackTrace();
		}
		
		File newfile = new File("NewName");
		
		boolean value = file.renameTo(newfile);
		
		if(value){
			System.out.println("The file name is a changed.");
		}
		
		else {
			System.out.println("The name cannot be changed.");
		}
	}

}
