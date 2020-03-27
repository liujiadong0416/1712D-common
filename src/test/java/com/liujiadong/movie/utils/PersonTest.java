package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		ArrayList<Person> arrayList = new ArrayList<>();
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			String format = simpleDateFormat.format(date);
			p.setDate(format);
			arrayList.add(p);
			System.out.println(p);
		}
	}

}
