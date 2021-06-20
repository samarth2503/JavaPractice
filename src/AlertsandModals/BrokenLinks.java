package AlertsandModals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		
		driver=new ChromeDriver();
	
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		linklist.addAll(driver.findElements(By.tagName("img")));
		
		List<WebElement> activelink = new ArrayList<WebElement>();
		
		for(int i=0;i<activelink.size();i++)
		{
			if(linklist.get(i).getAttribute("href")!=null)
			{
				activelink.add(linklist.get(i));
			}
		}
		
		System.out.println("Total number of links are : " +activelink.size());
		
		for(int j=0;j<activelink.size();j++)
		{
			HttpURLConnection connection = (HttpURLConnection) new URL(activelink.get(j).getAttribute("href")).openConnection();
			
			((URLConnection) connection).connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activelink.get(j).getAttribute("href")+"---------"+response);
		}
			
		
	}
}
