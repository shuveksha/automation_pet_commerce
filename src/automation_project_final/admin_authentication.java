package automation_project_final;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class admin_authentication extends user_dashboard{

	
	
	@Test(priority = 11)
	public static void login_admin() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("admin@gmail.com");
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("1234");
		driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/button[1]")).click();
		

		
		
		
		
	}
	

	
	

}
