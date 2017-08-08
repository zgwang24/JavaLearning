package stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Student {
	public static void main(String[] args) {
		String[] content = {"我有一只小毛驴", "舍不得骑"};
		File file = new File("word.txt");
		try{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bufw = new BufferedWriter(fw);
			for(int k = 0; k < content.length; k++){
				bufw.write(content[k]);
				bufw.newLine();
			}
			bufw.close();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
