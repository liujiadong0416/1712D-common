package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		Calendar can = Calendar.getInstance();
		can.set(2010, 0, 1);
		Date r= DateUtil.randomDate(can.getTime(), new Date());	
		System.out.println(r);
	}
}
