package MakeMyTRIProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebHandleElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		//maximize the website

		driver.manage().window().maximize();

		driver.get("https://www.redbus.com/");
		
		//Insect the element  using xpath 

		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).clear();
		
		// add the source and destination values using xpath

		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]"))
				.sendKeys("Paris");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();

		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]"))
				.sendKeys("London");

		Thread.sleep(5000);
        //add the date
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("document.getElementById('onward_cal').value='11/12/2024'");

		Thread.sleep(3000);

		driver.close();

	}

}