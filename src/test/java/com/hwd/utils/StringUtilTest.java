package com.hwd.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testToHtml() {
		String a="哇哦打卡     ";
		String html = StringUtil.toHtml(a);
		System.out.println(html);
	}

	@Test
	public void testIsPhoneNumber() {
		String b="17600023513";
		boolean c = StringUtil.isPhoneNumber(b);
		System.out.println(c);
	}

	@Test
	public void testIsEmail() {
		String cString="1105185293@qq.com";
		boolean email = StringUtil.isEmail(cString);
		System.out.println(email);
	}

	@Test
	public void testHasLength() {
		String str="hu";
		
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
	String str="11";
		
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomSimpleChinese() {
		String string = StringUtil.randomChineseString();
		System.out.println(string);
	}

	@Test
	public void testRandomChineseString() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomChineseString();
			 System.out.print(string+" ");
		 }
	}

	@Test
	public void testRandomChineseStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);

		}
	}

}
