package InterfaceExamples;

public class ChromeDriver extends RemoteWeb{
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.close();
		driver.get();
		driver.findElement();
		driver.findElements();
	}

}
