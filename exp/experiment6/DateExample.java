package experiment6;

import java.sql.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateExample {

	public static void main(String args[]) {
		String str = JOptionPane.showInputDialog("�����һ�����ڵ����:");
		int yearOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("���������·�:");
		int monthOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("������·ݵ�����:");
		int dayOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("����ڶ������ڵ����:");
		int yearTwo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("���������·�:");
		int monthTwo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("������·ݵ�����:");
		int dayTwo = Integer.parseInt(str);
		Calendar cal = Calendar.getInstance(); // ��ʼ����������
		cal.set(yearOne, monthOne, dayOne); // �� calendar ��ʱ������Ϊ yearOne �� monthOne �� dayOne ��
		long timeOne = cal.getTimeInMillis(); // calendar ��ʾ��ʱ��ת���ɺ���
		cal.set(yearTwo, monthTwo, dayTwo); // �� calendar ��ʱ������Ϊ yearTwo �� monthTwo �� dayTwo ��
		long timeTwo = cal.getTimeInMillis(); // calendar ��ʾ��ʱ��ת���ɺ��롣
		Date date1 = new Date(timeOne); // �� timeOne ���������� date1
		Date date2 = new Date(timeTwo); // �� timeTwo ���������� date2
		if (date2.equals(date1)) {
			System.out.println("�������ڵ��ꡢ�¡�����ȫ��ͬ");
		} else if (date2.after(date1)) {
			System.out.println("������ĵڶ������ڴ��ڵ�һ������");
		} else if (date2.before(date1)) {
			System.out.println("������ĵڶ�������С�ڵ�һ������");
		}
		long days = Math.abs(timeOne - timeTwo) / (3600 * 24 * 1000); // �������������������
		System.out.println(yearOne + "��" + monthOne + "��" + dayOne + "�պ�" + yearTwo + "��" + monthTwo + "��" + dayTwo
				+ "���" + days + "��");
	}

}
