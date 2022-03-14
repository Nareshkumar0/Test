package xpa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nk\\eclipse-workspace\\SeleLatest\\Driver\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			 driver.manage().window().maximize();
			driver.get("http://greenstech.in/selenium-course-content.html");
//WebElement user = driver.findElement(By.xpath("//input[@id='email']"));
			//user.sendKeys("9677380110");
			
WebElement txt = driver.findElement(By.xpath
		("//h1[contains(text(),' Certification')]"));
String text = txt.getText();
System.out.println(text);
			
	}

}
