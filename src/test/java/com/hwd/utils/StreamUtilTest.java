package com.hwd.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() {
		
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("E:/test.txt"));
	
		System.out.println(string);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

	@Test
	public void testReadTextFileFile() {
		
		String string = StreamUtil.readTextFile(new File("e:/test.txt"));
		System.out.println(string);
	}
}
