import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ControA 
{
 public static void main(String[] args)
 {
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https:www.google.com");
	 
	 
	 Actions action=new Actions(driver);
	WebElement search= driver.findElement(By.id("input"));
	search.sendKeys("lavanya");
	
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.keyUp(Keys.CONTROL);
	action.build().perform();
	 
	 
 }

}
