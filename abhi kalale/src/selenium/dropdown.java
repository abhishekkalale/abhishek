package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown{
	public static void main(String[] args) throws InterruptedException
	{

		//System.setProperty("webdriver.chrome.driver","./kalale/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./kalale/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ViPra/Desktop/dropdown.html");
		WebElement ele=driver.findElement(By.id("hotel"));
		Select s=new Select (ele);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("gobi");
		Thread.sleep(2000);
		s.deselectAll();
	}
}



