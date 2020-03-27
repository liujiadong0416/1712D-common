package com.liujiadong.movie.utils;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数
 * @author: 刘嘉栋
 * @date: 2020年3月26日 上午8:54:27
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random random = new Random();
		int i = random.nextInt(max-min+1);
		i=i+min;
		return i;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs) throws IllegalAccessException{
		if (subs>(max-min+1)) {
			throw new IllegalAccessException("subs参数过大");
		} else {
			int[] i=new int[subs];
			HashSet<Integer> hashSet = new HashSet<>();
			while (hashSet.size()!=subs) {
				int random = random(min, max);
				hashSet.add(random);
			}
			int j=0;
			for (Integer integer : hashSet) {
				i[j]=integer;
				j++;
			}
			return i;
		}
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str="123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
		char charAt = str.charAt(random(0, str.length()-1));
		return charAt;
	}
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="";
		int i=0;
		while (i!=length) {
			char randomCharacter = randomCharacter();
			str=str+randomCharacter;
			i++;
		}
		return str;
	}
}
