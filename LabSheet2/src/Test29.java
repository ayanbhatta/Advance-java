//serialization of student object
import java.io.*;
class Student implements Serializable{
	int regno;
	String name;
	double cgpa;
	public Student(int regno, String name, double cgpa) {
		super();
		this.regno = regno;
		this.name = name;
		this.cgpa = cgpa;
	}
	
}
public class Test29 {
	public static void main(String[] args) throws Exception{
		Student[] ob=new Student[10];
		ob[0] =new Student(141,"ayan",7.9);
		ob[1] =new Student(142,"sudarshan",7.9);
		ob[2] =new Student(140,"hisham",7.2);
		ob[3] =new Student(143,"adil",7.3);
		ob[4] =new Student(144,"prashant",8.9);
		ob[5] =new Student(145,"lohhit",7.6);
		ob[6] =new Student(146,"sami",7.7);
		ob[7] =new Student(147,"gaus",7.8);
		ob[8] =new Student(148,"drgaprasad",8.8);
		ob[9] =new Student(149,"faiz",7.1);
		
		FileOutputStream file=new FileOutputStream("C:\\ayan\\4cse3result.ser");
		ObjectOutputStream out= new ObjectOutputStream(file);
		for(int i=0;i<10;i++)
			out.writeObject(ob[i]);
		System.out.println("file written");
		out.close();
		file.close();
	}
}