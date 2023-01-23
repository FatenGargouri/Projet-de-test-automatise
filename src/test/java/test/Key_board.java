package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Key_board {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//key down
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
			
		//go to website
		driver.get("https://google.com");
		
		
		//send keys
		driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
		
		//Key down
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Selenium" +Keys.ENTER);
				
		//key up
		Actions action = new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		action.keyDown(Keys.SHIFT).sendKeys(search,"selenium").keyUp(Keys.SHIFT).sendKeys(" selenium").perform();
		Thread.sleep(1000);
		
		
		driver.findElement(By.name("q")).clear();
		Thread.sleep(3000);
		driver.quit();

	}

}
