package com.hwd.utils;

import java.util.Calendar;
import java.util.Date;
//Calendar 日历类 要掌握
public class DateUtil {
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description: 这是我的做的时间  随机返回10个时间段
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	//返回一个在某个时间段的随机日期
	public static Date randomDate(Date minDate ,Date maxDate) {
		//从1970年到minDate的毫米数
		long l1 = minDate.getTime();
		//从1970年到maxDate的毫米数
		long l2 = maxDate.getTime();
		Calendar c = Calendar.getInstance();
		long l3 = (long) (Math.random() * (l2-l1 +1 )+l1);
		c.setTimeInMillis(l3);
		
		return c.getTime();
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description: 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	    * 则返回的结果为2019-05-01 00:00:00
	    * 意思也就是返回返回当月的第一天最开始的时候  比如1月1日 0时0分0秒
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	public static Date getDateByInitMonth(Date src){
		//获取日历类
		Calendar c = Calendar.getInstance();
		//根据传入的日期构建日历类
		c.setTime(src);
		//设置月初
		c.set(Calendar.DAY_OF_MONTH, 1);//日
		c.set(Calendar.HOUR_OF_DAY, 0);//小时
		c.set(Calendar.MINUTE, 0);//分钟
		c.set(Calendar.SECOND, 0);//秒
		 return c.getTime();
		
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:这个的思路就是返回当月的最后一刻！ 那我就多加一月 然后减1秒  就是最后一刻
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	public static Date getDateByFullMonth(Date src){
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		//让月份加1
		c.add(Calendar.MONTH, 1);
		//让日期变成月初
		Date date = getDateByInitMonth(c.getTime());
		//让月初初始化日历类
		c.setTime(date);
		//让日期减去1秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	/**
	 * 返回当前日期的昨日日期
	 */
	public static Date getDateByBefore() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -1);
		return c.getTime();
		
	}
	
}
