package experiment6;

import java.sql.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class DateExample {

	public static void main(String args[]) {
		String str = JOptionPane.showInputDialog("输入第一个日期的年份:");
		int yearOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入该年的月份:");
		int monthOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入该月份的日期:");
		int dayOne = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入第二个日期的年份:");
		int yearTwo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入该年的月份:");
		int monthTwo = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("输入该月份的日期:");
		int dayTwo = Integer.parseInt(str);
		Calendar cal = Calendar.getInstance(); // 初始化日历对象
		cal.set(yearOne, monthOne, dayOne); // 将 calendar 的时间设置为 yearOne 年 monthOne 月 dayOne 日
		long timeOne = cal.getTimeInMillis(); // calendar 表示的时间转换成毫秒
		cal.set(yearTwo, monthTwo, dayTwo); // 将 calendar 的时间设置为 yearTwo 年 monthTwo 月 dayTwo 日
		long timeTwo = cal.getTimeInMillis(); // calendar 表示的时间转换成毫秒。
		Date date1 = new Date(timeOne); // 用 timeOne 做参数构造 date1
		Date date2 = new Date(timeTwo); // 用 timeTwo 做参数构造 date2
		if (date2.equals(date1)) {
			System.out.println("两个日期的年、月、日完全相同");
		} else if (date2.after(date1)) {
			System.out.println("您输入的第二个日期大于第一个日期");
		} else if (date2.before(date1)) {
			System.out.println("您输入的第二个日期小于第一个日期");
		}
		long days = Math.abs(timeOne - timeTwo) / (3600 * 24 * 1000); // 计算两个日期相隔天数
		System.out.println(yearOne + "年" + monthOne + "月" + dayOne + "日和" + yearTwo + "年" + monthTwo + "月" + dayTwo
				+ "相隔" + days + "天");
	}

}
