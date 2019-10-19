package com.hwd.utils;

import java.io.File;

public class FileUtil {
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:先判断是不是不为空或者null 然后通过.来截取后面的扩展名
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	public static String getExtendName(String fileName){
		if(null!=fileName &&fileName.length()!=0)
		 return fileName.substring(fileName.lastIndexOf("."));
		return "不是有效的文件";
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:我能通过io流找到
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	public static File getTempDirectory(){
		
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/**
	 * 
	    * @ClassName: DateUtil
	    * @Description:返回操作系统用户目录
	    * @author De.nnn
	    * @date 2019年10月11日
	    *
	 */
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
}
