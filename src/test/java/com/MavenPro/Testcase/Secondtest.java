package com.MavenPro.Testcase;

import org.testng.annotations.Test;

import Pages.Page2;

public class Secondtest {
	
	@Test
	public void thirdtest() {
		System.out.println("==>Secondtest-->its my third testcase");
	}

	@Test
	public void fourthtest() {
		Page2 p2=new Page2();
		p2.test1();
		System.out.println("==>Secondtest-->its my fourth testcase");
	}
}
