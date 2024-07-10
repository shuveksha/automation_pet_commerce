package automation_project_final;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class user_authenticationPage extends setup {
	@Test (priority = 0)
	public static void Register() {
		
	driver.findElement(By.cssSelector("body:nth-child(2) main:nth-child(2) section.d-flex.align-items-center:nth-child(1) div.container.text-center.position-relative.aos-init.aos-animate > a.btn-get-started.scrollto:nth-child(3)")).click();
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]")).sendKeys("alicia");
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("alicia345@gmail.com");
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")).sendKeys("88693");
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[5]/div[1]/input[1]")).sendKeys("88693");
	driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[6]/button[1]")).click();
	
}
	@Test (priority = 1)
	public static void login() {
		
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/form[1]/div[1]/a[1]")).click();//redirect to login page from register page
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("alicia345@gmail.com");
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("88693");
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
	
				
	}
		
	
	
	
	

}
