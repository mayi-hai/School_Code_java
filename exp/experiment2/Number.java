package experiment2;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int d4,d3,d2,d1,num=0;
		
		System.out.println("������һ����: ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		
		if(num>=1&&num<=10000) {
			d4=num/1000;
			d3=(num%1000)/100;
			d2=(num%100)/10;
			d1=num%10;
			
			if(d4!=0) {
				System.out.println(num+"��4λ��");
				if(d4==d1&&d3==d2){
					System.out.println(num+"�ǻ�����");
				}else {
					System.out.println(num+"���ǻ�����");
				}
				}else if(d3!=0) {
					System.out.println(num+"��3λ��");
					if(d3==d1) {
						System.out.println(num+"�ǻ�����");
				}else {
					System.out.println(num+"���ǻ�����");
				}
				}else if(d2!=0){
					System.out.println(num+"��2λ��");
					if(d2==d1){
						System.out.println(num+"�ǻ�����");
				}else{
					System.out.println(num+"���ǻ�����");
				}
				}else{
					System.out.println(num+"��1λ��");
					System.out.println(num+"�ǻ�����");
				}
			
			    }else{
				    System.out.println("��������1��9999֮�䣬���������룡����");
		}
	}

}
