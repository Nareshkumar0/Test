package xpa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actio {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\Nk\\eclipse-workspace\\SeleLatest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstechnologys.com/");
WebElement ctrl = driver.findElement(By.xpath("//a[text()='COURSES']"));
Thread.sleep(3000);
Actions action = new Actions(driver);
action.moveToElement(ctrl).perform();
Thread.sleep(3000);
WebElement mouse = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
action.moveToElement(mouse).perform();
//WebElement phy = driver.findElement(By.xpath("//span[text()='Python']"));
//phy.click();
Thread.sleep(3000);
driver.close();



	}

}
