package com.hwd.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	
	//方法1：返回min-max之间的随机整数
	public static int random(int min, int max){
		Random r  = new Random();
	 return r.nextInt(max-min +1) +min;
	}	
	
	
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。
	//应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	//1~~10  
	public static int[] subRandom (int min, int max, int subs){
		
		int dest[] =new int[subs];
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()!=subs) {
			set.add(random(min,max));
		}

		int i=0;
		for (Integer integer : set) {
			dest[i]=integer;
			i++;
		}
		
		return dest;
	}
	/**
	 * 
	    * @Title: randomCharacter
	    * @Description:调用上面的random方法，然后枚举一下
	    * @param @return    参数
	    * @return char    返回类型
	    * @throws
	 */
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
		
	}
	//返回参数length个字符串,调用randomCharacter()方法 
	public static String randomString(int length){
		String str="";
		for(int i =0;i<length;i++) {
		 	str+=randomCharacter();
		}
		return str;
		
	}

}
