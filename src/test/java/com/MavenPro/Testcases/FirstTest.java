package com.MavenPro.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver;
	@Test(priority=0)
	public void firsttest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.switchTo().frame("navbar-iframe");
		driver.findElement(By.xpath("//input[@id='b-query']")).sendKeys("Girigowda");
		System.out.println("data is successfull");
		driver.quit();

	}


	@Test(priority=1)
	public void secondtest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "omayo (QAFox.com)");
		System.out.println(title);
		System.out.println("title is successfully verified");
		driver.quit();

	}

}
