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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.logging.Logger;
import java.io.FileWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class RegistracijaTest {
	  public WebDriver driver;
	  public Map<String, Object> vars;
	  public JavascriptExecutor js;
	  private Logger logs = Logger.getLogger(RegistracijaTest.class.getName());
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
	  public void registracija() {
		    driver.get("https://www.shoppster.rs/");
		    driver.manage().window().setSize(new Dimension(1936, 1056));
		    try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {}
		    driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/footer/cx-page-layout/cx-page-slot[2]/ung-anonymous-consent-management/div/div/div/div[2]/button[2]")).click();
		    driver.findElement(By.cssSelector(".mini-login__link-name")).click();
		    driver.get("https://www.shoppster.rs/login/register?modalAction=REGISTRATION");
		    driver.findElement(By.name("firstName")).click();
		    driver.findElement(By.name("firstName")).sendKeys("<name>");
		    driver.findElement(By.name("lastName")).click();
		    driver.findElement(By.name("lastName")).sendKeys("<last name>");
		    driver.findElement(By.name("email")).click();
		    driver.findElement(By.name("email")).sendKeys("<email>");
		    driver.findElement(By.name("password")).click();
		    driver.findElement(By.name("password")).sendKeys("<password>");
		    driver.findElement(By.name("confirmpassword")).click();
		    driver.findElement(By.name("confirmpassword")).sendKeys("<repeat password>");
		    driver.findElement(By.name("birthDay")).click();
		    driver.findElement(By.name("birthDay")).sendKeys("<day>");
		    driver.findElement(By.cssSelector(".ng-placeholder")).click();
		    driver.findElement(By.xpath("/html/body/ung-root/ung-storefront/main/cx-page-layout/cx-page-slot[1]/ung-register/div/div[3]/ung-register-form/div/form/div[5]/ung-loyalty-basic-info-form/div/div[1]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")).click();
		    driver.findElement(By.name("birthYear")).click();
		    {
		      WebElement element = driver.findElement(By.cssSelector(".ng-arrow-wrapper"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).clickAndHold().perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector(".ng-arrow-wrapper"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).perform();
		    }
		    {
		      WebElement element = driver.findElement(By.cssSelector(".ng-arrow-wrapper"));
		      Actions builder = new Actions(driver);
		      builder.moveToElement(element).release().perform();
		    }
		    driver.findElement(By.cssSelector(".date-selector")).click();
		    driver.findElement(By.name("birthYear")).sendKeys("<year>");
		    driver.findElement(By.cssSelector(".radio:nth-child(1) > label")).click();
		    driver.findElement(By.name("consent")).click();
		    driver.findElement(By.cssSelector(".btn-secondary--red")).click();
		    js.executeScript("window.scrollTo(0,0)");
		    
		    String poruka ="\nNaziv testa: RegistracijaTest\n"+
			"Opis testa: Testiranje uspesnosti registracije korisnika\n"+
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
