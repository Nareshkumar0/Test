package xpa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpat {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Nk\\eclipse-workspace\\SeleLatest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
		txt.sendKeys("9677380110");
		driver.findElement(By.xpath("//input[@type='password']"));
		
		
		
		
		
	}

}
