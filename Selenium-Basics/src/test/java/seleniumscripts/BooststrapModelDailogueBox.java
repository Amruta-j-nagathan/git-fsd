package seleniumscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooststrapModelDailogueBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		WebElement e1 = driver.findElement(By.xpath("//div[@class='_3skCyB']/descendant::input[1]"));
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_3skCyB']/descendant::input[1]")));
        e1.sendKeys("9999999999");
        driver.findElement(By.xpath("//div[@class='JFPqaw']/descendant::span[1]")).click();
        
        
        
	}

	
}
