package experiment5;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("you are a student");
		String s2 = new String("how are you");
		if (s1.equals(s2)) // 使用 equals 方法判断 s1 与 s2 是否相同
		{
			System.out.println("s1 与 s2 相同");
		} else {
			System.out.println("s1 与 s2 不相同");
		}
		String s3 = new String("22030219851022024");
		if (s3.startsWith("220302")) // 判断 s3 的前缀是否是“220302”。
		{
			System.out.println("相同");
		}
		String s4 = new String("你"), s5 = new String("我");
		if (s4.compareTo(s5) > 0) // 按着字典序 s4 大于 s5 的表达式。
		{
			System.out.println("按字典序 s4 大于 s5");
		} else {
			System.out.println("按字典序 s4 小于 s5");
		}
		int position = 0;
		String path = "c:\\java\\jsp\\A.java";
		position = path.lastIndexOf("\\"); // 获取 path 中最后出现目录分隔符号的位置
		System.out.println("c:\\java\\jsp\\A.java 中最后出现\\的位置:" + position);
		String fileName = path.substring(position + 1);// 获取 path 中“A.java”子字符串。
		System.out.println("c:\\java\\jsp\\A.java 中含有的文件名:" + fileName);
		String s6 = new String("100"), s7 = new String("123.678");
		int n1 = Integer.parseInt(s6); // 将 s6 转化成 int 型数据。
		double n2 = Double.parseDouble(s7); // 将 s7 转化成 double 型数据。
		double m = n1 + n2;
		System.out.println(m);
		String s8 = String.valueOf(m); // String 调用 valuOf(int n)方法将 m 转化为字符串对象
		position = s8.indexOf(".");
		String temp = s8.substring(position + 1);
		System.out.println("数字" + m + "有" + temp.length() + "位小数");
		@SuppressWarnings("unused")
		String s9 = new String("ABCDEF");
		char a[] = s8.toCharArray(); // 将 s8 存放到数组 a 中。
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(" " + a[i]);
		}
	}

}