package uk.co.automationtesting;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.basepage;
import pageobjects.HomePage;
import pageobjects.ShopHomepage;
import pageobjects.ShopProductpage;

public class OrderCompleteTest extends basepage {

	public OrderCompleteTest() throws IOException {
		super();
		
	}
	
	@BeforeTest
	public void setup() throws IOException {
		driver = getDriver();
		driver.get(getUrl());
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver = null;
	}
	
	@Test
	
	public void EndtoendTest() throws IOException {
		
		HomePage home = new HomePage(driver);
		home.getCookie().click();
		
		home.getToggle().click();
		
		WebElement tsl = home.getTestStoreLink();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tsl);
		tsl.click();
		
		ShopHomepage shophome = new ShopHomepage(driver);
		shophome.getProdOne().click();
		
		ShopProductpage shopProd = new ShopProductpage(driver);
		Select option = new Select(shopProd.getSizeOption());
		
		option.selectByVisibleText("M");
		
		shopProd.getQuantIncrease().click();
		
		shopProd.getAddToCartBtn().click();
		
	}
}
