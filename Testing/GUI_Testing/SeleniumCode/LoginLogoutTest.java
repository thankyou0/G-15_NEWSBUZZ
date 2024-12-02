// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import java.net.MalformedURLException;
import java.net.URL;
public class LoginLogoutTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginLogout() {
    driver.get("https://normal-frontend.onrender.com/");
    driver.manage().window().setSize(new Dimension(1410, 799));
    driver.findElement(By.cssSelector(".MuiBox-root:nth-child(1) > .MuiBox-root > .MuiPaper-root .MuiCardContent-root > div > div")).click();
    driver.findElement(By.cssSelector(".MuiBox-root:nth-child(1) > .MuiBox-root > .MuiPaper-root .MuiCardContent-root > .MuiTypography-root")).click();
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).sendKeys("202201254@daiict.ac.in");
    driver.findElement(By.id("password")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-textError"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".MuiButton-fullWidth"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.id("password")).sendKeys("12345678");
    driver.findElement(By.cssSelector(".MuiButton-fullWidth")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("div:nth-child(9) > .MuiButtonBase-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector("#demo-customized-button > .MuiSvgIcon-root"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".btn")).click();
  }
}