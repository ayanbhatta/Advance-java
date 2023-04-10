//file operation     no, of words in multithread.txt
import java.io.*;
public class Test23 {

	public static void main(String[] args) throws Exception{
		File source=new File("C:\\ayan\\multithread.txt");
		FileReader fr =new FileReader(source);
		BufferedReader br =new BufferedReader(fr);
		String s;
		String[] words;
		int wordcount = 0;
		while((s=br.readLine())!=null) {
			words=s.split("[\\s+]");
			wordcount = wordcount +words.length;
		}
		System.out.println("No. of words in an essay is "+wordcount);
	}

}
