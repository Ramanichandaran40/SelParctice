package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
	public static void main(String[]args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()= '✕']")).click();
		WebElement src = driver.findElement(By.name("q"));
		src.sendKeys("Redmi Note 10 PRO");
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(2000);
		WebElement cl = driver.findElement(By.xpath("(//div[@class ='_4rR01T'])[2]"));
		cl.click();
		String pWin = driver.getWindowHandle();
		Set<String> cWin = driver.getWindowHandles();
		for (String x:cWin) {
			if(!pWin.equals(x)) {
				driver.switchTo().window(x);
				System.out.println(x);
				
			}
		}
}
}
