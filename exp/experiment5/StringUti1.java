package experiment5;

public class StringUti1 {
	private String data;
	
	public StringUti1(String data) {
		this.data=data;
	}
	/**
	 * ��ָ�����ȷֽ��ַ���data�������ֽ����ַ������浽һ���ַ���������
	 * @param size ָ�����ȵ���ʽ����
	 * @return �����ֽ����Ӵ����ַ�������
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
	    StringUti1 su = new StringUti1("������Ȼ��ѧ������Ŀ.doc");
	    String[] strs = su.parse(5);
	    for (int j=0; j<strs.length; j++) {
	    	System.out.println(strs[j]);
	    	}
	    }
}
