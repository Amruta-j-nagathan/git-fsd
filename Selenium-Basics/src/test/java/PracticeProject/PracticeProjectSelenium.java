package PracticeProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeProjectSelenium {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		Robot robot = new Robot();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]"))
				.sendKeys("Paris");
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]"))
				.sendKeys("London");
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]"))
				.click();
		Thread.sleep(5000);
// click on search button
		driver.findElement(By.id("search_butn")).click();
		Thread.sleep(10000);
		driver.get("https://www.remove.bg/");
		Thread.sleep(3000);
		WebElement e1 = driver
				.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		e1.click();
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\AutoIT_Files\\ScriptUpload2.exe");
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement e2 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e2).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='nav-text'])[7]")).click();
// DB demo
// Screenshot
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/project.png");
		FileUtils.copyFile(srcFile, destFile);
	}
}
