package google.Test.Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); // launch Chrome
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	
	@Test (priority=1, groups="Title") //1
	public void googleTitleTest() {
		driver.getTitle();
		System.out.println("title");
	}	
	
	@Test (priority=3, groups="Logo") //3
	public void googleLogoTest() {
	driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test (priority=2, groups="Link Test") //2
	public void mailLinkTest() {
	driver.findElement(By.linkText("Gmail")).isDisplayed();
	
	}
	
	@Test (priority=4, groups="Test") //4
	public void test1() {
		System.out.println("test1");
		
		}
	
	@Test (priority=5,groups="Test") //5
	public void test2() {
		System.out.println("test2");
		
		}
	
	@Test (priority=6, groups="Test") //6
	public void test3() {
		System.out.println("test3");
		
		}
	@AfterMethod
	public void takedown(){
		driver.quit();
		}
	}
	
	
	


