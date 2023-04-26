import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Car {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Miss Rizwana Saife\\Desktop\\Testing\\Selenium-jars\\drivers\\chromedriver.exe");

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*"); ChromeDriver driver = new
		 * ChromeDriver(options);
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hubspot.com/email-signature-generator");
		
		Thread.sleep(500);
		driver.findElement(By.id("hs-eu-confirmation-button")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(500);
		
		Actions act = new Actions(driver);
		  act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		  WebElement textele = driver.findElement(By.linkText("Create signature"));
		  textele.click();
		 
		  
			/*
			 * 
			 * 
			 * Actions act = new Actions(driver);
			 * act.sendKeys(Keys.PAGE_DOWN).build().perform();
			 * 
			 * WebElement layoutTab = driver.findElement(By.xpath("//button[#'FORM']"));
			 */
		
		  
		  //WebElement tempone = driver.findElement(By.xpath("/html//div[@id='FORM-tabpanel']/fieldset[1]/div[1]//input"));
	
			 
		  //tempone.sendKeys("Riwana");
		 
	}
	
}
