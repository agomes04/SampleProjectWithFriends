package com.coding.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.generic.code.creation.PhpBaseLogin;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		PhpBaseLogin.initializeBrowser(); 
		//PhpBaseLogin.login(null); 
		
		
		try {
			System.out.println(1/10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Testing complete");
	}

}
