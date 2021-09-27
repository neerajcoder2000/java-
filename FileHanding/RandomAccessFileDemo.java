import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) {
		
		
		// Creating a new RandomAccessFile - "F2" 
		
		try {
			double d = 1.5; 
            float f = 14.56f;
            
            
			RandomAccessFile f_ref = new RandomAccessFile("C:\\Users\\DELL1\\Desktop\\java2", "rw");
			
			// Writing to file
			f_ref.writeUTF("Hello,Good Morning!");
			
			// File Pointer at index position - 0 
			f_ref.seek(0);
			
			// read() method : 
			System.out.println("Use of read()Method: "+ f_ref.read());
			
			f_ref.seek(0);
			byte[] b = {1,2,3};
			
			// Use of .read(byte[] b) method : 
			System.out.println("Use of read(byte[]): " + f_ref.read(b) );
			
			// readBoolean() method : 
			System.out.println("Use of readboolean(): " + f_ref.readBoolean());
			
			// readByte() method : 
			System.out.println("Use of readByte(): " + f_ref.readByte());
			
			// readChar() : 
			System.out.println("Use of readchar(): " + f_ref.readChar());
			
			f_ref.seek(0);
			f_ref.writeDouble(d);
			f_ref.seek(0);
			
			//readDouble:
			System.out.println("Use of readDouble(): " + f_ref.readDouble());
			
			f_ref.seek(0);
			f_ref.writeFloat(f);
			f_ref.seek(0);
			
			//readFloat:
			System.out.println("Use of readFloat(): " + f_ref.readFloat() );
			
			f_ref.seek(0);
			
			// Create array upto geek.length
			byte[] arr = new byte[(int) f_ref.length()];
			
			// readFully() : 
			f_ref.readFully(arr);
			
			String str1 = new String(arr);
			System.out.println("Use of readFully(): " + str1);
			
			f_ref.seek(0);
			
			//readFully(Byte[] b, int off, int len):
			f_ref.readFully(arr, 0, 8);
			
			String str2 = new String(arr);
			System.out.println("Use of readFully(Byte[] b,int off,int len) : "+ str2);
			
			
		} catch (IOException e) {
			System.out.println("Something want wrong");
			e.printStackTrace();
		}

	}

}
