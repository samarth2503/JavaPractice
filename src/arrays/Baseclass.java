package arrays;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("1");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-setuid-sandbox");
		options.setBinary("/path/to/other/chrome/binary");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\chromedriver.exe");
		try
		{
			driver = new ChromeDriver();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		driver.navigate().to("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String[] dateSplit(LocalDate d1)
	{
		
		DateTimeFormatter sf = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		
		String date1 = sf.format(d1);
		
		String dates1[] = date1.split("-");
		return dates1;
	}
	
	public int monthsInNumber(String month)
	{
		int m1=0;
		String months[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
		for(int k=0;k<months.length;k++)
		{
			if(month.equals(months[k]))
			{
				m1=k;
			}
		}
		return m1;
	}
	
	public boolean selectDate(LocalDate d1,LocalDate d2,WebElement w1) throws InterruptedException
	{
		

		String dates1[]=dateSplit(d1);
		String dates2[]=dateSplit(d2);
		int m1=monthsInNumber(dates1[1]);
		int m2=monthsInNumber(dates2[1]);

		Actions ac = new Actions(driver);
		
		if(Integer.parseInt(dates1[2])<=Integer.parseInt(dates2[2]))
		{
			
			Select s = new Select(w1);
			if((dates1[1].equals(dates2[1])) && (Integer.parseInt(dates1[0])<=Integer.parseInt(dates2[0])))
			{
				
				System.out.println("15");
				if(m1>=0)
				{

					Thread.sleep(5000);
					s.selectByValue(Integer.toString(m1));
					Thread.sleep(3000);
					System.out.println("the fisrt date si  : "+ dates1[0]);
					driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a[text()='"+dates1[0]+"']")).click();

					driver.findElement(By.xpath("//input[@name=\"to\"]")).click();
					WebElement w2 = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]//select[@class=\"ui-datepicker-month\"]"));
					Select s1 = new Select(w2);
					s1.selectByValue(Integer.toString(m2));
					System.out.println("Element " + m2 + "is selected");
					driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a[text()='"+dates2[0]+"']")).click();

				}
			return true;
			}
			else if((m1<m2))
			{
					
				if(m1>=0 && m2>=0)
				{
					System.out.println("19");
					Thread.sleep(4000);
					s.selectByValue(Integer.toString(m1));
					System.out.println("Element " + m1 + "is selected");
					driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a[text()='"+dates1[0]+"']")).click();

					driver.findElement(By.xpath("//input[@name=\"to\"]")).click();
					WebElement w2 = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]//select[@class=\"ui-datepicker-month\"]"));
					Select s1 = new Select(w2);
					s1.selectByValue(Integer.toString(m2));
					System.out.println("Element " +m2 + "is selected");
					driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td//a[text()='"+dates2[0]+"']")).click();

				}
				
				return true;
			}
			else
			{
				System.out.println("from dates/Month is greater than To Dates/Month");
				return false;
			}
		
		}
		else
		{
			System.out.println("From Year is greater than To Year");
			return false;
		}
	}
	
}
