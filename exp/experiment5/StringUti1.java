package experiment5;

public class StringUti1 {
	private String data;
	
	public StringUti1(String data) {
		this.data=data;
	}
	/**
	 * 按指定长度分解字符串data，并将分解后的字符串保存到一个字符串数组中
	 * @param size 指定长度的形式参数
	 * @return 包含分解后的子串的字符串数组
	 */
	public String[] parse(int size) {
		int length = data.length()/size;
		if(data.length() % size !=0) {
			length++;
		}
		String[] strs = new String[length];
		int i =0;
		for(i =0;i<length-1;i++) {
			strs[i]=data.substring(i*size,(i+1)*size);
		}
		strs[i]=data.substring(i*size);
		return strs;
	}

    public static void main(String[] args) {
	    StringUti1 su = new StringUti1("国家自然科学基金项目.doc");
	    String[] strs = su.parse(5);
	    for (int j=0; j<strs.length; j++) {
	    	System.out.println(strs[j]);
	    	}
	    }
}
