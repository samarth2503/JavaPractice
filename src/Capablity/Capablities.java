package Capablity;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Capablities {
	
	private static final UnexpectedAlertBehaviour UnexpectedAlertBehaviour = null;

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addExtensions();
		option.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		DesiredCapabilities.chrome();
		
		cap.merge((Capabilities) option);
		
		
		cap.setAcceptInsecureCerts(true);
		option.addArguments("--disable-infobars");
		option.addArguments("disable-popup-blocking");
		option.addArguments("start-maximized");
		
		System.out.println("Class is :- "+cap.getClass());
		System.out.println("Platform is :"+cap.getPlatform());
		System.out.println("Browser name is :"+cap.getBrowserName());
		System.out.println("Version is :"+cap.getVersion());
		
		cap.setCapability("setAcceptInsecureCerts", true);		
		//cap.setCapability("default");
		
	}

}
