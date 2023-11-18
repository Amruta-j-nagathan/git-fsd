package com.app.TestNG.extentreports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetUpCheck {
//C:\Users\DELL\eclipse-workspace\SL_SeleniumDemo_Workspace\ATE-Phase2-Selenium-TestNG
	@Test
	public void extentdemo() {
		//create an object to initiate extent report engine
		
		ExtentReports ex = new ExtentReports();
		
		//give the path of the folder in which extent report has to be created
		//right click on project-->properties-->go to resourse on left-->copy the path of project
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\DELL\\eclipse-workspace\\SL_SeleniumDemo_Workspace\\ATE-Phase2-Selenium-TestNG\\extentReport\\report.html");
		ex.attachReporter(sparkreporter);
		
		ex.flush();
	}
	@Test
	public void extentDemo2() throws IOException {
		ExtentReports ex = new ExtentReports();
		File file = new File("report1.html");
		
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		
		ex.attachReporter(sparkreporter);
		ex.flush();
		Desktop.getDesktop().browse(new File("report1.html").toURI());
	}
	
}
