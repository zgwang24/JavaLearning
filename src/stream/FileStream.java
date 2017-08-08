package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileStream {
	public static void main(String[] args) {
		File file = new File("word.txt");
		try{
			FileOutputStream out = new FileOutputStream(file);
			byte[] buy = "我有一只小毛驴，从来也不骑。".getBytes();
			out.write(buy);
			out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			FileInputStream in = new FileInputStream(file);
			byte[] byt = new byte[1024];
			int len = in.read(byt);
			System.out.println(new String(byt, 0, len));
			in.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
