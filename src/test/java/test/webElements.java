package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class webElements {

	public static void main(String[] args) throws InterruptedException {
		
		//chemin of webdriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
				
		//go to google
		driver.get("https://google.com");
				
		//FindElements
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
				
		
		//appel d'un élement dans un page web 
		WebElement  search_checkbox= driver.findElement(By.name("q"));
		// ecrire dans ce element et press entrer 
		search_checkbox.sendKeys("Automation step by step",Keys.ENTER);
				
		//appel de plusieurs elements comme select 
		driver.get("https://trytestingthis.netlify.app/");
		List<WebElement> options =  driver.findElements(By.name("Optionwithcheck[]"));
				for(WebElement option : options) {
					System.out.println(option.getText());}
		Thread.sleep(3000);
				
		
		//champ texte avec id
		driver.findElement(By.id("fname")).sendKeys("faten");
		Thread.sleep(3000);

	    driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		//Utilisation de above , near
		WebElement passwordBox = driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton));
		passwordBox.sendKeys("ABCD");
				
		Thread.sleep(4000);
		
		//chercher un element dans un autre élement (formulaire et champ texte)
		driver.get("http://www.google.com");
		WebElement searchForm = driver.findElement(By.tagName("form"));
		WebElement searchBox = searchForm.findElement(By.name("q"));
		searchBox.sendKeys("selenium");


		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webElement");
		// Get attribute of current active element
		String attr = driver.switchTo().activeElement().getAttribute("title");
		System.out.println(attr);

		//get element tagname, text, css:getTagName(),getText(),getCssValue()
		driver.get("http://www.google.com");
		String value = driver.findElement(By.cssSelector("h1")).getTagName();

		//How to check element is Enabled | is Selected:isEnabled(),isSelected()
		//driver.findElement(By.name("---")).isEnabled();
		//driver.findElement(By.xpath("---")).isSelected();
				
		driver.close();
		driver.quit();

	}
	}


