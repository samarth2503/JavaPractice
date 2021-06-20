package arrays;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
public class DatesPractice extends Baseclass {
	
	
	


//	@Test
//	public void DatePickerTest() throws InterruptedException
//	{
//		Thread.sleep(6);
//		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"at4win-header\"]//a")).click();
//		
//		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown'][2]//a[contains(text(),'Date pickers')]")).click();
//		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown open']//ul//li[1]//a")).click();
//		
//		driver.findElement(By.xpath("//div[@class='container-fluid text-center']//div[@class='col-md-6 text-left']//input[@placeholder='dd/mm/yyyy']")).click();
//		
//		String s = driver.findElement(By.xpath("//h1[contains(text(),'Bootstrap Date Pickers Example')]")).getText();
//		System.out.println("The Text is:"+s);
//		Thread.sleep(100);
//		String date=driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[2]//th[@class='datepicker-switch']")).getText().toString();
//		String ar[] = date.split(" ");
//		System.out.println(date);
////		Calendar cal = Calendar.getInstance();
////		int month = cal.get(Calendar.MONTH);
////		int year = cal.get(Calendar.YEAR);
	
////		String date = String.valueOf(month).concat((" ").concat(String.valueOf(year)));
//		Thread.sleep(100);
//		while(true)
//		{
//			System.out.println(1);
//			if (!date.equals("March 2020"))
//			{
//				System.out.println(2);
//				driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[2]//th[@class='prev']")).click();
//				System.out.println("Before Click: "+date);
//				date=driver.findElement(By.xpath("//div[@class='datepicker-days']//thead//tr[2]//th[@class='datepicker-switch']")).getText().toString();
//				System.out.println("after Click: "+date);
//			}
//			else
//			{
//				driver.findElement(By.xpath("//table[@class='table-condensed']//tbody//tr[3]//td[3]")).click();
//				
//				break;
//			}
//		}
//	}
//	
	@Test
	public void JQueryDatePicker() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"at4win-header\"]//a")).click();
		
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown'][2]//a[contains(text(),'Date pickers')]")).click();
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown open']//ul//li[2]//a")).click();
		Thread.sleep(1000);
		
		LocalDate d1 = LocalDate.of(2020, 05, 1);
		LocalDate d2 = LocalDate.of(2020, 06, 22);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"from\"]")).click();
		Thread.sleep(2000);
		WebElement w1 = driver.findElement(By.xpath("//div[@id=\"ui-datepicker-div\"]//select[@class=\"ui-datepicker-month\"]"));
		
		boolean flag=selectDate(d1,d2,w1);
		if(flag)
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("Terst is failed");
		}
		
	}
	
	@Test
	public void JQueryList() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"at4win-header\"]//a")).click();
		
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown'][2]//a[contains(text(),'List Box')]")).click();
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@class='nav navbar-nav']//li[@class='dropdown open']//ul//li[2]//a")).click();
		
		Select s = new Select(driver.findElement(By.xpath("//select[@class=\"form-control pickListSelect pickData\"]")));
		
		List<WebElement> elments = driver.findElements(By.xpath("//select[@class=\"form-control pickListSelect pickData\"]//option"));
		
		for(int j=0;j<elments.size();j++)
		{
			System.out.print("Before selecting element :");
			System.out.println("\t "+ ((WebElement) elments).getText());
		}
		
		String s1[] = {"Isis","Alice","Laura","Lara","Julia"};
		
		for(int i=0;i<s1.length;i++)
		{
			s.selectByVisibleText(s1[0]);
			driver.findElement(By.xpath("//div[@class=\"col-sm-2 pickListButtons\"]//button[1]")).click();
		}
		
		Select s2 = new Select(driver.findElement(By.xpath("//select[@class=\"form-control pickListSelect pickListResult\"]")));
		List<WebElement> elements = driver.findElements(By.xpath("//select[@class=\"form-control pickListSelect pickListResult\"]//option"));
		
		for(int k=0;k<elements.size();k++)
		{
			System.out.print("Aft selecting element :");
			System.out.println("\t "+ ((WebElement) elements).getText());
		}
	}



	
}
