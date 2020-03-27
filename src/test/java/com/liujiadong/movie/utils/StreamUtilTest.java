package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testReadInputStream() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadString() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadFile() {
		 List<String> list;
		try {
			list = StreamUtil.read(new File("e:\\data.txt"));
			for (String string : list) {
				System.out.println(string);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
