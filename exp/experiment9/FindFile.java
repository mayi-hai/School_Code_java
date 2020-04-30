package experiment9;

import java.io.File;

public class FindFile {

	public  void findFile(File file) {
		if(file.isFile()) {
			System.out.println(file.getAbsolutePath()+"is file");
		}
		else if(file.isDirectory()) {
			System.out.println(file.getAbsolutePath()+"is directory");
			File[] children = file.listFiles();
			for(File child : children) {
				findFile(child);
			}
		}
	}
	public static void main(String[] args) {
		FindFile ff = new FindFile();
		ff.findFile(new File("D:\\java\\experiment1"));
	}

}
