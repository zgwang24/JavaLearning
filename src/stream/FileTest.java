package stream;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("word.txt");
		if(file.exists()){
			file.delete();
			System.out.println("deleted");
		}else{
			try{
				file.createNewFile();
				System.out.println("created");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
