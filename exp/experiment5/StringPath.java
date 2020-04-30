package experiment5;

import java.io.File;

public class StringPath {
	
	private File file;
	public StringPath(File file){
		this.file=file;
	}
	public String getName() {
		return file.getName();
	}
	public String getParent() {
		return file.getParent();
	}
	public String getExtensions() {
		String str[]=file.getName().split("\\.");
		return str[str.length-1];
	}
	public static void main(String[] args) {
		File file = new File("E:\\eclipse\\plugins\\com.jcraft.jsch_0.1.28.jar");
		StringPath ss=new StringPath(file);
		System.out.println("文件所在目录 ："+ss.getParent());
		System.out.println("文件名  ："+ss.getName());
		System.out.println("文件类型: "+ss.getExtensions());
	}
}
