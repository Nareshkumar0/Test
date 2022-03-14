import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Nk\\eclipse-workspace\\SeleLatest\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("mail2narez@gmail.com");
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("padmavadhe");
	WebElement btn = driver.findElement(By.name("login"));
btn.click();
}

}

