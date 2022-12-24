package com.MavenPro.Testcase;

import org.testng.annotations.Test;

import Pages.Page1;

public class Firsttest {
	
	@Test
	public void firstest() {
		Page1 p=new Page1();
		p.test();
		
		System.out.println("===>Firsttest-->It is first testcast");
	}
	
	@Test
	public void secondtest() {
		System.out.println("==>Firsttest-->second testcase");
	}

}
