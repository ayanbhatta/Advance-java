//deserialization of Student
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test30 {

	public static void main(String[] args)throws Exception {
		Student ob=null;
		FileInputStream file = new FileInputStream("C:\\ayan\\4cse3result.ser");
		ObjectInputStream oi=new ObjectInputStream(file);
		ob=(Student)oi.readObject();
		for(int i=0;i<=Student[i];i++) {
			System.out.print(ob.regno);
			System.out.print(ob.name);
			System.out.print(ob.cgpa);
		}
		System.out.println();
	}

}
