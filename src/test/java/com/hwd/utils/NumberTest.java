package com.hwd.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.junit.Test;

public class NumberTest {
	/**
	 * 
	    * @Title: testIsNumber
	    * @Description: TODO该方法是判断参数是否为数字，包含小数
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testIsNumber() {
		String number=" ";
		boolean b = Number.isNumber(number);
		System.out.println(b);
	}
	/**
	 * 
	    * @Title: testGetAge
	    * @Description: 输入任意一个生日，返回至今天的年龄整数
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testGetAge() {
		Calendar c = Calendar.getInstance();
		c.set(1997,8,02);
		
		System.out.println(Number.getAge(c.getTime()));
		
		
	}
	/**
	 * 
	    * @Title: testGetExtendName
	    * @Description: 判断源字符串是否有值，空引号和空格也算没值
	    * @param     参数
	    * @return void    返回类型
	    * @throws
	 */
	@Test
	public void testGetExtendName() {
		String text=" ";
		boolean b = Number.getExtendName(text);
		System.out.println(b);
	}
	@Test
	public void exam() {
		HashMap map=new HashMap();
	}

}
