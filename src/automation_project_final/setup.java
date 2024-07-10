package automation_project_final;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class setup {			
	public static  FirefoxDriver driver;
	public static String url;
		
	@BeforeSuite
	public static void setupfunction() {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			url = "http://localhost:3000/";
			driver.get(url);
			}
	
	@AfterSuite
	public static void close() {
		driver.quit();
	
	}}


