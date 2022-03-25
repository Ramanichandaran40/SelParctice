package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static void main(String[]args) {
		String expecmon = "Sept 2022";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramanichandaran M\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("onward_cal")).click();
		while(true) {
		WebElement month = driver.findElement(By.xpath("//td[@class ='monthTitle']"));
		String s = month.getText();
		if(s.equals(expecmon)) {
			break;
		}else {
			driver.findElement(By.xpath("//button[text() ='>']")).click();
		}
	}
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> tRow = table.findElements(By.tagName("tr"));
		for(int i=0;i<tRow.size();i++) {
			WebElement row = tRow.get(i);
			List<WebElement> tData = row.findElements(By.tagName("td"));
			for(int j =0;j<tData.size();j++) {
			WebElement data = tData.get(j);
			String d = data.getText();
			if(d.contains("15")) {
				data.click();
			}
			}
		}
	}

}
