import java.io.*;
public class Test19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String foldername="ayan";
		File f = new File("C:\\"+foldername);
		if(f.mkdir()==true)
			System.out.println("k1 folder created");
		else
			System.out.println("error in creation");
	}

}
