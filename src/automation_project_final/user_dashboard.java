package automation_project_final;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class user_dashboard extends user_authenticationPage{
	@Test(priority=2)
	//view Items
	public static void view_items() throws InterruptedException {
		driver.findElement(By.linkText("Catitems")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Fishitems")).click();
		Thread.sleep(100);
		driver.findElement(By.linkText("Dogitems")).click();
		Thread.sleep(100);
		}

	//add single item into cart 

	@Test(priority=3)
	public static void addtocart_single() throws InterruptedException{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();//view product button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click(); //add to cart button
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click(); //add  button
		
}

	
	
	
	//add multiple times into cart 
	
	@Test(priority=4)
	public static void addtocart_multiple(){
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	    driver.navigate().back();
	    driver.navigate().back();
	    driver.navigate().back();
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")).click();
	    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	
}
	
	
	 
	//checkout
	@Test(priority=5)
	public static void checkout() {
	driver.findElement(By.xpath("//body[1]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]")).sendKeys("johndoe");
	driver.findElement(By.id("email")).sendKeys("johndoe@gmail.com");
	driver.findElement(By.id("phone")).sendKeys("083772739");;
	driver.findElement(By.id("street_address")).sendKeys("15205 North Kierland Blvd. Suite 100");;
	driver.findElement(By.name("city")).sendKeys("Scottsdale");
	driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[6]/button[1]")).click();
	
		
	}
	
	//check My order
	
		@Test(priority=6)
		public static void Myorders() {
			driver.findElement(By.linkText("Home")).click(); //redirect to homepage
			driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
			driver.findElement(By.xpath("//body[1]/section[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")).click();
		}
	
		
		//search functionality for item that exist 
		
		@Test(priority=7)
			public static void search_exist() throws InterruptedException {
				
				driver.findElement(By.linkText("Home")).click(); //redirect to homepage
				driver.findElement(By.name("search_query")).sendKeys("dog belt");
				driver.findElement(By.xpath("//body[1]/main[1]/section[1]/div[1]/form[1]/button[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.className("logo")).click();
				
				
				
				
				
			}
			
			//search functionality for item that doesn't exist 
			
			@Test(priority=9)
			public static void search_not_exist() throws InterruptedException {
				driver.findElement(By.linkText("Home")).click(); //redirect to homepage
				driver.findElement(By.name("search_query")).sendKeys("puppy milk feeder");
				driver.findElement(By.xpath("//body[1]/main[1]/section[1]/div[1]/form[1]/button[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.linkText("Home")).click(); //redirect to homepage
				
			}
			
			//logout
			
			
			@Test(priority=10)
			public static void logout() {
				driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
			
		}
}
