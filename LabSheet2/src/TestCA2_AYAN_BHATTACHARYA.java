import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

//
public class TestCA2_AYAN_BHATTACHARYA {

	public static void main(String[] args) throws Exception{
		File source=new File("C:\\ayan\\multithread.txt");
		FileReader fr =new FileReader(source);
		BufferedReader br =new BufferedReader(fr);
		String s;
		String[] sents,words;
		int wordcount = 0,sentencecount=0,charactercount=0;
		while((s=br.readLine())!=null) {
			words=s.split("[\\s+]");
			wordcount=wordcount+words.length;
			sents=s.split("\n");		
			sentencecount=sentencecount+sents.length;
			charactercount = charactercount +s.length();
			System.out.println(sentencecount+" "+s);
		}
		System.out.println("No. of words in an essay is: "+wordcount);
		System.out.println("No. of sentences in an essay is: "+sentencecount);
		System.out.println("No. of character in an essay is:s "+charactercount);
	}

}
