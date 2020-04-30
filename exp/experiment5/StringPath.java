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
		System.out.println("�ļ�����Ŀ¼ ��"+ss.getParent());
		System.out.println("�ļ���  ��"+ss.getName());
		System.out.println("�ļ�����: "+ss.getExtensions());
	}
}
