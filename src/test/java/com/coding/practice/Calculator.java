package com.coding.practice;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.page.factory.creation.MasterPageFactory;

public class Calculator {

	SoftAssert sa; 
	
	
//	public static void main(String[] args) {
//		double v1, v2, result;
//		char op;
//
//		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter any equation");
//		v1 = obj.nextDouble(); 
//		op = obj.next().charAt(0);
//		v2 = obj.nextDouble(); 
//		
//		if (op == '+') {
//			System.out.print(v1 + v2);
//		} else if(op == '-'){
//			System.out.print(v1 - v2);
//		} else if(op == '*'){
//			System.out.print(v1 * v2);
//		} else if(op == '%'){
//			System.out.print(v1 % v2);
//		} else {
//			System.out.println("Operation not supported");
//		}
//		
//		System.out.println();
//		
//	}
	
	@Test
	public void test1() {
		sa = new SoftAssert(); 
		sa.assertEquals(true, false);
		sa.assertEquals("Arif", "Leeana");
		sa.assertEquals(876, 123);
		sa.assertAll();
	}
	
	@Test
	public void test2() {
		sa = new SoftAssert();
		sa.assertEquals(true, false);
		sa.assertEquals("Arif", "Leeana");
		Assert.assertEquals(false, true);
		sa.assertEquals(876, 123);
		sa.assertAll();
	}
	
	@Test
	public void test3() {
		sa = new SoftAssert();
		sa.assertEquals(true, false);
		sa.assertEquals("Arif", "Leeana");
		sa.assertEquals(876, 123);
		sa.assertAll();
	}

}
