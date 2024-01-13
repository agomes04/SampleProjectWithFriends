package com.utility.creation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {
	
	public void getScreenShot(WebDriver driver){
		File folder = new File("./target/screenshot");
		if(!folder.exists()) {
			folder.mkdir(); 
		}
		
		
		TakeScreenShot takeScreenShot = (TakeScreenShot) driver; // type cast 
		
//		File filePath = takeScreenShot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(filePath, new File("./target/screenshot.png"));

	}
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://tlcnow.tlclender.com/");
		TakeScreenShot obj = new TakeScreenShot(); 
		obj.getScreenShot(driver); 
    }
	
	
	
	
	
	
	
	
	
	
//	code form StackOverFlow
//	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	// Now you can do whatever you need to do with it, for example copy somewhere
//	FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	
	
	
	
	
	
//	Can I use Robot Class to take screen shot? 
//	public static void main(String[] args) throws Exception {
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://tlcnow.tlclender.com/");
//        Robot robot = new Robot();
//        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
//        BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
//        ImageIO.write(bufferedImage, "png", new File("/target/screenshot.png"));
//    }
	
}
