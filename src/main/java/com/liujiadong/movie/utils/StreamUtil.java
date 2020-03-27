package com.liujiadong.movie.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {
    public static List<String> read(InputStream InputStream) throws IOException{
    	List<String> list = new ArrayList<String>();
    	BufferedReader reader = new BufferedReader(new InputStreamReader(InputStream));
    	String line="";
		while((line=reader.readLine())!=null) {
			list.add(line);
		}
		return list;
	}
    
	public static List<String> read(String filePath) throws IOException{
         FileInputStream inputStream = new FileInputStream(filePath);
         return read(inputStream);
		
	}
	public static List<String> read(File file) throws IOException{
		FileInputStream inputStream = new FileInputStream(file);
	    return read(inputStream);
		
	}
}
