import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
public class Test22 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File source=new File("C:\\ayan\\multithread.txt");
		File target = new File("C:\\ayan\\multithread_copy.txt");
		FileReader fr=new FileReader(source);
		FileWriter fw=new FileWriter(target);
		BufferedReader br=new  BufferedReader(fr);
		BufferedWriter bw=new  BufferedWriter(fw);
		String line;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		bw.close();
		br.close();
		System.out.println("1 file copied");
	}

}
