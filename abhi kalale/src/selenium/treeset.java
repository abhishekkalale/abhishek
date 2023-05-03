package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class treeset{
	public static void main(String[] args) throws InterruptedException
	{

		//System.setProperty("webdriver.chrome.driver","./kalale/chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./kalale/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select (ele);
		 List<WebElement> allopt = s.getOptions();
	TreeSet<String> t = new TreeSet<String>();
		for(WebElement opt : allopt)
		{
		  t.add(opt .getText());
		}
		
		for(String o:t)
		{
			System.out.println(o);
		}
			
		}
}

		
		  
		



