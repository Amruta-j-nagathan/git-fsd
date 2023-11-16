package MakeMyTRIProject;

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

public class PracticeProject {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
        //maximize the screen
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//open website

		driver.get("https://www.remove.bg/");
		
		

		Thread.sleep(5000);

		// Web element to upload file

		WebElement e1 = driver
				.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));

		

		e1.click();

		// Below code for script editor : Go to Window search > type "Script"
		
		Thread.sleep(5000);
		
		System.out.println("Above-----");

		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\AutoIT_Files\\ScriptUpload1.exe");
		
		System.out.println("below-----");
		
		
		Thread.sleep(5000); 
		
		//open the website
		
		driver.get("https://www.amazon.com/");
		
		//Take screenshot of website
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Project_Screenshots/amazon_image.png");
		FileUtils.copyFile(srcFile, destFile);
		

		
		driver.close();
       
	}

}
