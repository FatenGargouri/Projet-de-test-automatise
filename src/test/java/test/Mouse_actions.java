package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//go to website
		driver.get("https://google.com");
		Thread.sleep(2000);
		
		//navigate to website
		driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement boxA = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement boxC = driver.findElement(By.xpath("//li[text()='C']"));
		WebElement boxD = driver.findElement(By.xpath("//li[text()='D']"));
		
		//actions : move to élement , click , out
		Actions action = new Actions(driver);
		action.moveToElement(boxA);
		action.clickAndHold();
		action.release();
		Thread.sleep(2000);
		
		
		//actions : move to élement , click , double click , build , perform 
		action.moveToElement(boxC);
		action.release();
		action.contextClick(boxD);
		action.doubleClick(boxD);
		//Build(). perform() is used to compile and execute the actions class.
		action.build().perform();
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));
		
		
		//actions drag and drog
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(element1, element2);
		//Build(). perform() is used to compile and execute the actions class.
		action1.build().perform();
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();

	}

}
