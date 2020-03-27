package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		String percent = NumberUtil.getPercent(77, 101);
		 System.out.println(percent);
	}

}
