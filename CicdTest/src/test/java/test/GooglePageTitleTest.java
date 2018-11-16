package test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageTitleTest {
	
	private WebDriver driver;
	
	@BeforeTest
	public void before() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  String actiualTitle = driver.getTitle();
	  String expectedTitle = "Google";
	  assertEquals(expectedTitle, actiualTitle);
  }
  
  @AfterTest
  public void after() {
	  driver.quit();
  }
  
}
