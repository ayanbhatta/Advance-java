//create file using channel and buffer
//create a file tablet.store
//add contents as data
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.*;
public class Test27 {
	public static void main(String[] args)throws Exception {		
		String data="iphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000lorem40"
				+ "savsda"+"iphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000lorem40"+"iphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000lorem40"+"iphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000\niphone13 8000, samsaung 6000lorem40";
		RandomAccessFile file=new RandomAccessFile("C:\\ayan\\tablet.store","rw");
		ByteBuffer buffer = ByteBuffer.allocate(data.length());
		for(int i=0;i<data.length();i++) {
			buffer.put((byte)data.charAt(i));
		}
		FileChannel channel=file.getChannel();
		buffer.rewind();
		channel.write(buffer);
		System.out.println("1 file written");
		channel.close();
		file.close();
	}
}