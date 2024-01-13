import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleTabs {
	
	public static WebDriver driver; 
	public static String something; 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\daach\\git\\repository\\SampleProjectForReview\\SampleProject\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); 
		driver.navigate().to("https://github.com/");
		driver.navigate().refresh(); 
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.open();"); 
		
		driver.get("https://www.amazon.com/"); 
		 
		
		List<String> tabs = new ArrayList<>(driver.getWindowHandles()); 
		driver.switchTo().window(tabs.get(1)); 
		
		driver.get("https://www.google.com/"); 
		
		for(String x:tabs) {
			something = x + tabs; 
		}
		
		driver.switchTo().window(something); 
	}

}
