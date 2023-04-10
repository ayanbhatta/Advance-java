import java.io.*;
public class Test24 {
	public static void main(String arr[]) {
		String foldername="4CSE3";
		File f =new File("C:\\"+foldername);
		if(f.exists())
			System.out.println("array exists");
		else if(f.mkdir()==true)
			System.out.println("Successfully created");
		else
			System.out.println("Cannot be created");
	}
}
