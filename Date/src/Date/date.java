package Date;

import java.util.Calendar;
import java.util.Date;

public class date {
	public static void main(String args[]) {
		Calendar calendar =Calendar.getInstance();//����һ����������
		calendar.setTime(new Date());//�õ�ǰʱ���ʼ������
		String year=String.valueOf(calendar.get(Calendar.YEAR)),
				month=String.valueOf(calendar.get(Calendar.MONTH)+1),
				day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
				int hour=calendar.get(Calendar.HOUR_OF_DAY),
						minute=calendar.get(Calendar.MINUTE),
						second=calendar.get(Calendar.SECOND);
				System.out.print("���ڵ�ʱ���ǣ�");
				System.out.print(""+year+"��"+month+"��"+day+"��");
				System.out.println(""+hour+":"+minute+":"+second);
				calendar.set(1949, 10,1);
				long time1949=calendar.getTimeInMillis();
				calendar.set(2010, 8, 15);
				long time2010=calendar.getTimeInMillis();
				long between=(time2010-time1949)/(1000*60*60*24);
				System.out.println("1949��10��1����2010��8��15��֮����������:"+between+"��");		
	}
}

