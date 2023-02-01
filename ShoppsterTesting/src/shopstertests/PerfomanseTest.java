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

public class PerfomanseTest {
	  public WebDriver driver;
	  public Map<String, Object> vars;
	  public JavascriptExecutor js;
	  private Logger logs = Logger.getLogger(PerfomanseTest.class.getName());
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
		    //First page
		    long start1 = System.currentTimeMillis();
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/main/cx-page-layout/cx-page-slot[1]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[1]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/main/cx-page-layout/cx-page-slot[1]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[1]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	long finish1 = System.currentTimeMillis();
	      	long perf1 = finish1 - start1;
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	//Second page
	      	long start2 = System.currentTimeMillis();
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[2]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[2]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	long finish2 = System.currentTimeMillis();
	      	long perf2 = finish2 - start2;
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	//Third page
	      	long start3 = System.currentTimeMillis();
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[5]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[5]/ung-main-category-navigation-level-two/nav/ul/li[2]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	long finish3 = System.currentTimeMillis();
	      	long perf3 = finish3 - start3;
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	//Forth page
	      	long start4 = System.currentTimeMillis();
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[3]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[3]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	long finish4 = System.currentTimeMillis();
	      	long perf4 = finish4 - start4;
	      	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
	      	//Fifth page
	      	long start5 = System.currentTimeMillis();
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout/cx-page-slot[6]/ung-main-category-navigation-button"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
		    {
		        WebElement element = driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[8]"));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(element).perform();
		    }
	      	driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[9]/ung-main-category-navigation-wrapper/ung-main-category-navigation/nav/ul/li[8]/ung-main-category-navigation-level-two/nav/ul/li[1]/ung-main-category-navigation-level-three/nav/ul/li[1]")).click();
	      	long finish5 = System.currentTimeMillis();
	      	long perf5 = finish5 - start5;
	      	System.out.println("Vreme otvaranja prve stranice: " + (perf1 / 1000.0) + "s.");
	    	System.out.println("Vreme otvaranja druge stranice: " + (perf2 / 1000.0) + "s.");
	    	System.out.println("Vreme otvaranja trece stranice: " + (perf3 / 1000.0) + "s.");
	    	System.out.println("Vreme otvaranja cetvrte stranice: " + (perf4 / 1000.0) + "s.");
	    	System.out.println("Vreme otvaranja pete stranice: " + (perf5 / 1000.0) + "s.");
	    	System.out.println("Ukupno vreme: " + ((perf1 + perf2 + perf3 + perf4 + perf5) / 1000.0) + "s, prosecno vreme otvaranja po stranama je: " + ((perf1 + perf2 + perf3 + perf4 + perf5) / 5000.0) + "s.");
	  
	    	String poruka ="\nNaziv testa: PerfomanseTest\n"+
			"Opis testa: Testiranje perfomansi otvaranja 5 razlicitih stranica\n"+
			"Uspesnost: Test je uspesno izvrsen\n"+
			"Perfomanse: \n"+
			"\tVreme otvaranja prve stranice: " + (perf1 / 1000.0) + "s.\n"+
			"\tVreme otvaranja druge stranice: " + (perf2 / 1000.0) + "s.\n"+
			"\tVreme otvaranja trece stranice: " + (perf3 / 1000.0) + "s.\n"+
			"\tVreme otvaranja cetvrte stranice: " + (perf4 / 1000.0) + "s.\n"+
			"\tVreme otvaranja pete stranice: " + (perf5 / 1000.0) + "s.\n\n"+
			"Ukupno vreme: " + ((perf1 + perf2 + perf3 + perf4 + perf5) / 1000.0) + "s, prosecno vreme otvaranja po stranama je: " + ((perf1 + perf2 + perf3 + perf4 + perf5) / 5000.0) + "s.\n\n";
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