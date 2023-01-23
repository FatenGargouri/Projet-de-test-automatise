package test;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;


public class browserActions {

	public static void main(String[] args) throws Exception{
		
		//chemin of webdriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//go to google
		driver.get("https://google.com");
		
		//go to automationstepbystep after google 
		driver.navigate().to("https://automationstepbystep.com");
		
		//afficher l'url de la page 
		System.out.println(driver.getCurrentUrl());
		
		//afficher le titre de la page
		System.out.println(driver.getTitle());
		
		
		//refresh,back,forward
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
		
		//open and switch to new window or tab
		String originalWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.switchTo().window(originalWindow);
		Thread.sleep(2000);
		
		
		
		//size
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);
		
		
	
		// javascript
		driver.get("https://google.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement button = driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(2000);
		js.executeScript("console.log('... Hello World...')");
		
		
		
		

		//fermer driver
		driver.close();
		
		
		
	}
}