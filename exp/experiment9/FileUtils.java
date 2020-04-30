package experiment9;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtils {
	/**
	 * 从文件file读取数据并输出到屏幕
	 * @param file
	 */
	public void readFromFile(File file) throws IOException{
		FileInputStream fis = new FileInputStream(file);
		int b =-1;
		while((b = fis.read()) !=-1) {
			System.out.print((char)b);
		}
		fis.close();
	}
	public static void main(String[] args) {
		FileUtils f = new FileUtils();
		try {
		    f.readFromFile(new File("C:\\Users\\Administrator\\eclipse-workspace\\dcy\\src\\experiment9\\FindFile.java"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
