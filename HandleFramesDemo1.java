 package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFramesDemo1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		/*
		driver.get("http://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();

		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();   //frame1
		
		driver.switchTo().defaultContent();  //switch back to page
		
		driver.switchTo().frame("packageframe");
		driver.findElement(By.linkText("WebDriver")).click();   //frame2 
		
		driver.switchTo().defaultContent();  //switch back to page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click();
		
		*/
		
		//another one website
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		 
		//frame`1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
		
		//inner iframe
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("div.AB7Lab")).click();	
		
		
		driver.switchTo().defaultContent();
	
		

	}


}
