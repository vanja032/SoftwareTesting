package shopstertests;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;
import io.ous.jtoml.ParseException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class KorpaTest {
	  public WebDriver driver;
	  public Map<String, Object> vars;
	  public JavascriptExecutor js;
	  private Logger logs = Logger.getLogger(KorpaTest.class.getName());
	  @Before
	  public void setUp() {
		  	System.setProperty("webdriver.chrome.driver", "<driver path>");
		    driver = new ChromeDriver();
		    js = (JavascriptExecutor) driver;
		    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    	driver.quit();
	  }
	  @Test
	  public void korpa() {
		    driver.get("https://www.shoppster.rs/");
		    driver.manage().window().setSize(new Dimension(1936, 1056));
		    try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/footer/cx-page-layout/cx-page-slot[2]/ung-anonymous-consent-management/div/div/div/div[2]/button[2]")).click();
		    //First element
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/main/cx-page-layout/cx-page-slot[1]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[4]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/main/cx-page-layout/cx-page-slot[1]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[4]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("//*[@id=\"cx-page-section\"]/div/div/ung-product-pagination/div/div[1]/div[1]/ung-product-grid-item/div/div[6]/ung-add-to-cart/div/ung-button/button")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      //Second element
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[1]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[1]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("//*[@id=\"cx-page-section\"]/div/div/ung-product-pagination/div/div[1]/div[1]/ung-product-grid-item/div/div[6]/ung-add-to-cart/div/ung-button/button")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      //Third element
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[6]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[6]/ung-main-category-navigation-level-two/nav/ul/li[2]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("//*[@id=\"cx-page-section\"]/div/div/ung-product-pagination/div/div[1]/div[1]/ung-product-grid-item/div/div[6]/ung-add-to-cart/div/ung-button/button")).click();
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[5]/ung-mini-cart/a")).click();
	      	
	      	String poruka ="\nNaziv testa: KorpaTest\n"+
			"Opis testa: Testiranje uspesnosti dodavanja proizvoda u korpu\n"+
			"Uspesnost: Test je uspesno izvrsen\n\n";
			logs.info(poruka.toString());

			try {
				FileWriter fw = new FileWriter("<path>\\Logs\\logs.txt", true);
				fw.write(poruka.toString());
				fw.flush();
				fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	  }
}