package com.liujiadong.movie.utils;

import java.util.Date;

public class DateUtil {
	
	public static Date randomDate(Date min,Date max){
		long t1 = min.getTime();
		long t2 = max.getTime();
		if(t1>t2){
			return null;
		}
		double d = Math.random();
		long x=(long) ((t2-t1)*d)+t1;
		return new Date(x);
	}
}
