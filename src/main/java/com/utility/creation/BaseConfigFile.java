package com.utility.creation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfigFile {

	public static String getConfigValue(String value) {
		String file = "./config.properties";
		FileInputStream fis;
		Properties obj; 
		String values = null; 
		try {
			fis = new FileInputStream(file);
			obj = new Properties();
			obj.load(fis);
			values = obj.getProperty(value);
		} catch (IOException e) {
			throw new RuntimeException("FIle doesn't exist. Check config file.");
			
		}
		
		return values; 

	}

	public static void main(String[] args) throws Throwable {
		System.out.println(BaseConfigFile.getConfigValue("EmpID"));
	}

}
