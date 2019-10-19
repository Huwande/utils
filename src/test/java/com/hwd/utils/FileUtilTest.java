package com.hwd.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:测试的话就是给一个文件的名字加扩展名 然后操作
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testGetExtendName() {
		String file="abc.doc";
		String name = FileUtil.getExtendName(file);
		System.out.println(name);
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testGetTempDirectory() {
		  File file = FileUtil.getTempDirectory();
		  System.out.println(file);
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	@Test
	public void testGetUserDirectory() {
		  File file = FileUtil.getUserDirectory();
		  System.out.println(file);
	}

}
