package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testIsHttpUrl() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsNumber() {
		boolean b = StringUtil.isNumber("-123.123");
		System.out.println(b);
	}

	@Test
	public void testIsPhone() {
		boolean b = StringUtil.isPhone("19710137879");
		System.out.println(b);
	}

	@Test
	public void testIsEMail() {
		boolean b = StringUtil.isEMail("348828809@qq.com");
		System.out.println(b);
	}

	@Test
	public void testHasLength() {
		String str=" ";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str=" ";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(100);
		System.out.println(c);
	}


	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);	
		}
	}

}
