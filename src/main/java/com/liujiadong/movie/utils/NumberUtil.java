package com.liujiadong.movie.utils;

import java.text.NumberFormat;

public class NumberUtil {
	public static String getPercent(int current, int total){
		// 创建一个数值格式化对象  
        NumberFormat numberFormat = NumberFormat.getInstance();  
        // 设置精确到小数点后2位  
        numberFormat.setMaximumFractionDigits(2);  
        String result = numberFormat.format((float) current / (float) total * 100);  
		return result+"%";
	}
}
