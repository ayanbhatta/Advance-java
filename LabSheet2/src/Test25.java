import java.io.*;
public class Test25 {
	public static void main(String[] args)throws Exception {
		String filename="students";
		String foldername="4CSE3";
		FileOutputStream source =new FileOutputStream("C:\\"+foldername+"\\"+filename+".dat");
		System.out.println("file created");

String header="Name		Regdno	Essaysubmitted\n";
String rec1="Irfan"+"       "+String.valueOf(123)+"		     yes\n";
String rec2="Manoj"+"       "+String.valueOf(124)+"		     yes\n";
String rec3="Pavan"+"       "+String.valueOf(126)+"			no\n";
source.write(header.getBytes());
source.write(rec1.getBytes());
source.write(rec2.getBytes());
source.write(rec3.getBytes());
source.close();
System.out.println("3 Record added to student file");
	}
}