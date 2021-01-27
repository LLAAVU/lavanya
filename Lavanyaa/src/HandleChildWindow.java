import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindow {
   
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		
		System.out.println("title of main window:"+ driver.getTitle());
		
		
		WebElement childw=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]"));
		childw.click();
		
		SwitchToWindow(2);
		
		System.out.println("title of child window:"+driver.getTitle());
		
		Thread.sleep(2000);
		
		SwitchToWindow(1);
		
		System.out.println("title of main window:"+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
	}

	private static void SwitchToWindow(int index) 
	{
	
		String x=null;
		Set<String> ChildWindow=driver.getWindowHandles();
		Iterator<String> iter=ChildWindow.iterator();
		
		for(int j=1;j<=index;j++)
		{
			x=iter.next();
			
		}
		driver.switchTo().window(x);
		
		
		
	}

}
