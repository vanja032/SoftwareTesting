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

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IspravnaRegistracijaTest {
	  public WebDriver driver;
	  public Map<String, Object> vars;
	  public JavascriptExecutor js;
	  private Logger logs = Logger.getLogger(IspravnaRegistracijaTest.class.getName());
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
	  public void ispravnipodaci() {
		    driver.get("https://www.shoppster.rs/");
		    driver.manage().window().setSize(new Dimension(1936, 1056));
		    try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/footer/cx-page-layout/cx-page-slot[2]/ung-anonymous-consent-management/div/div/div/div[2]/button[2]")).click();
		    driver.findElement(By.cssSelector(".mini-login__link-name")).click();
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.cssSelector(".login__label > input[" + "type=\"email\"" + "]")).sendKeys("<email>");
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.cssSelector(".login__label > input[" + "type=\"password\"" + "]")).sendKeys("<password>");
		    try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.cssSelector("button[" + "type=\"submit\"" + "]")).click();
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {}
		    assertEquals(driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/header/cx-page-layout[1]/cx-page-slot[3]/ung-mini-login/div/div[2]/span")).getText().trim(), "Vanja");
	  
		    String poruka ="\nNaziv testa: IspravnaRegistracijaTest\n"+
			"Opis testa: Testiranje tacnosti podataka tokom registracije korisnika\n"+
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