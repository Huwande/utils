package com.hwd.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Number {
	/**
	 * 
	    * @ClassName: Number
	    * @Description: 判断是否为数字，包含小数  首先是0-9随机后面＋上.0-9多次
	    * @author De.nnn
	    * @date 2019年10月13日
	    *
	 */
	public static boolean isNumber(String number) {
		String regex="^[0-9]+(.[0-9]+)?$";
		return number.matches(regex);
		
	}
	/**
	 * 
	 * @Title: getAge 
	 * @Description: 根据生日计算年龄
	 * @param birthday
	 * @return
	 * @return: int
	 */
	@Test
	public static int getAge(Date birthday) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		//把我传过来的日期初始化
		//2019-10-13  2000-9-15
		c.setTime(birthday);
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		
		int age=yearNow - yearBirth;
	
		return age;
	}
	/**
	 * 
	 * @Title: getExtendName 
	 * @Description: 判断文本是否有值
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static boolean getExtendName(String fileName){
		if(null!=fileName &&fileName.length()!=0 && fileName!=" ") {
			return true;
		}else {
			return false;
		}
	
	}
}
