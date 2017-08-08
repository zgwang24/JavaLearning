package stream;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("word.txt");
		if(file.exists()){
			String name = file.getName();
			System.out.println(name);
			long length = file.length();
			System.out.println(length);
			boolean hidden = file.isHidden();
			System.out.println(hidden);
		}
	}	
}
