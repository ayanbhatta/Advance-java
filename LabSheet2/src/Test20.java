import java.io.*;
public class Test20 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File f = new File("C:\\ayan"+"\\multithread.txt");
		String essay= "Multithreading is concurent programming\nLine2\nThis is java\nMultithreading\nline5";
		FileWriter fw = new FileWriter(f);
		fw.write(essay);
		fw.close();
//		System.out.println("1 File created & written");
	}

}
