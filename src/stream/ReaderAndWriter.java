package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriter {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");
		try{
			if(!file.exists()){
				file.createNewFile();
			}
			FileWriter out = new FileWriter(file);
			String s  = "你就像小毛驴一样倔强";
			out.write(s);
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(!file.exists()){
				file.createNewFile();
			}
			FileReader in = new FileReader(file);
			char[] bt = new char[1024];
			int len = in.read(bt);
			System.out.println(new String(bt, 0, len));
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
