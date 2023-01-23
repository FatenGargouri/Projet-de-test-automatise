package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		
		//JS Alert
		//chemin vers le bouton 
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//avoir alerte
		Alert alert1 = driver.switchTo().alert();
		//afficher le texte d'alerte 
		System.out.println(alert1.getText());
		Thread.sleep(2000);
		//entrer accept
		alert1.accept();
		

		//JS Confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		alert2.dismiss();
		

		//JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Selenium");
		alert3.accept();
		
		
		Thread.sleep(2000);
		driver.quit();


	}

}
