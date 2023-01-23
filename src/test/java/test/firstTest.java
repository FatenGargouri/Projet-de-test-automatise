package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class firstTest {
	public static void main(String[] args)
	{
		        
		        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				//WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				
				//go to website
				driver.get("https://google.com");
				
				//close browser
				driver.close();
	}

}
