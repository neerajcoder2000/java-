package Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		try {
			FileInputStream fis=new FileInputStream("abc.txt");
			
			//by using for loop
			
			byte b[]=new byte[100];
			
			fis.read(b);
			
			for(int i=0;i<b.length;i++) {
				System.out.print((char) b[i]);
			}
			
			//by using while loop
			/*
			int i;
			while((i=fis.read())!=-1){
				System.out.println((char)i);
			}
			*/
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
