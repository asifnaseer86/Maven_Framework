package cyborgensys.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testing testng xml file from maven
	@Test
	public void BrowserAutomation() 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("");
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void elementsUI() 
	{
		System.out.println("elementsUI");
	}

}
