package com.liujiadong.movie.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	/**
	 * 
	 * @Title: getAgeByBirthday 
	 * @Description: 算年龄
	 * @param date
	 * @return
	 * @return: int
	 */
	public static int getAgeByBirthday(Date date) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);//获取系统的年
		int s_month = c.get(Calendar.MONTH);//获取系统的月
		int s_day = c.get(Calendar.DAY_OF_MONTH);//获取系统的日
		//用传入的日期格式化一个日历类
		c.setTime(date);
		int c_year = c.get(Calendar.YEAR);//获取出生日期的年
		int c_month = c.get(Calendar.MONTH);//获取出生日期的月
		int c_day = c.get(Calendar.DAY_OF_MONTH);//获取出生日期的日
	
		int age=s_year-c_year;
		if(s_month<c_month) {
			age--;
		}
		if(s_month==c_month&&s_day<c_day) {
			age--;
		}
		return age;
	}
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: 月末
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date) {
		Calendar c = Calendar.getInstance();
		//初始化时间
		c.setTime(date);
		//1月份
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());//月初
		c.setTime(initMonth);//初始化时间
		
		c.add(Calendar.SECOND, -1);//减一秒
		return c.getTime();
		
	}
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: 返回月初
	 * @param date
	 * @return
	 * @return: Date
	 */
	public  static Date  getInitMonth(Date date) {
		Calendar c = Calendar.getInstance();//��ȡ��ǰϵͳʱ���������
		//初始化时间
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//月初
		c.set(Calendar.HOUR_OF_DAY, 0);//一天的0小时
		c.set(Calendar.MINUTE, 0);//一天的0分钟
		c.set(Calendar.SECOND, 0);//一天的0秒
		return c.getTime();
	}
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 两个日期中的随机日期
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
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
