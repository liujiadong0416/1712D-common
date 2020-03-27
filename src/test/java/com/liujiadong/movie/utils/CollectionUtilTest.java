package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testHasValue() {
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add("1");
		boolean hasValue = CollectionUtil.isEmpty(hashSet);
		System.out.println(hasValue);
	}

}
