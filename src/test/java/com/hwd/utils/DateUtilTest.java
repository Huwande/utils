package com.hwd.utils;

import static org.junit.Assert.fail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:我先是设置日期的格式 中国人 中国日期
	    * 紧接着就是循环 10个随机值  random DATe 
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testRandomDate() {
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
		for (int i = 0; i <10; i++) {
		
			Date date = DateUtil.randomDate(c.getTime(), new Date());
			String string = df.format(date);
			System.out.println(string);
			
		}
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:这个就是我已经在前面设置过 这个测试我就是要设置日期格式 其实设置一个时间来测试
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testGetDateByInitMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2000, 2, 10);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:这个就是我已经在前面设置过 这个测试我就是要设置日期格式 其实设置一个时间来测试 然后前面会-1秒
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2008, 1, 22);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		
		System.out.println(string);
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:这个就是把前面的两个方法调用过来 然后拼接 然后替换
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testSql() {
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = sql.replace("{1}",df.format(date)).replace("{2}", df.format(date2));
		System.out.println(string);
		
	}
	
	@Test
	public void testBefore() {
		Date date = DateUtil.getDateByBefore();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(date));
	}
}
