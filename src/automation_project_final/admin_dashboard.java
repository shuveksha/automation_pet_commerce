package automation_project_final;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class admin_dashboard extends admin_authentication {

    @Test(priority = 12)
    public static void processOrder() {
        // Set a reasonable explicit wait timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Click on "View details"
        driver.findElement(By.linkText("View details")).click();

        // Wait for the input element to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/dd[1]/input[1]")));

        // Select "completed" from dropdown
        WebElement selectElement = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/dl[1]/form[1]/dt[1]/select[1]"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("completed");

        // Click the submit button
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/dd[1]/input[1]")).click();
    }

    // Add cat products
    @Test(priority = 13)
    public static void Addcat() {
        driver.findElement(By.linkText("Add")).click();
        driver.findElement(By.id("pname")).sendKeys("cat belt");
        driver.findElement(By.cssSelector("#formFileMultiple")).sendKeys("C:\\Users\\shuve\\OneDrive\\Pictures\\create campaign page.png");
        WebElement selectElement = driver.findElement(By.name("pcategory"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Cat");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]")).click();
    }

    // Add dog products
    @Test(priority = 14)
    public static void Adddog() {
        driver.findElement(By.linkText("Add")).click();
        driver.findElement(By.id("pname")).sendKeys("dog belt");
        driver.findElement(By.id("pprice")).sendKeys("100");
        driver.findElement(By.cssSelector("#formFileMultiple")).sendKeys("C:\\Users\\shuve\\OneDrive\\Pictures\\create campaign page.png");
        WebElement selectElement = driver.findElement(By.name("pcategory"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Dog");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]")).click();
    }

    // Add fish products
    @Test(priority = 15)
    public static void Addfish() {
        driver.findElement(By.linkText("Add")).click();
        driver.findElement(By.id("pname")).sendKeys("yellow drinking bottle for pets");
        driver.findElement(By.id("pprice")).sendKeys("100");
        driver.findElement(By.cssSelector("#formFileMultiple")).sendKeys("C:\\Users\\shuve\\Downloads\\51tmWKtEYFS._SY355_ (1).jpg");
        WebElement selectElement = driver.findElement(By.name("pcategory"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Fish");
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/button[1]")).click();
    }
    
    //update dog products
    
    
    @Test(priority = 16)
    public static void viewCompletedorders() {
       driver.findElement(By.linkText("Completed orders")).click();
       driver.findElement(By.linkText("View details")).click();
      
    
    }
  
}
