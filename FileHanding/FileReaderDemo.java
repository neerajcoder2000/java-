package Day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr=new FileReader("File1.txt");
			
			char ch[]=new char[100];
			
			fr.read(ch);
			
			fr.close();
			
			for(int i=0;i<ch.length;i++) {
				System.out.println(ch[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
