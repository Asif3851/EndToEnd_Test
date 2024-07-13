package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	public static  WebDriver d;
	public static FileReader file;
	public static Properties prop;
    @BeforeSuite
	public void setUp() throws IOException {
		if(d==null) {
			file= new FileReader("D:\\SeleniumAutomationframwork\\POM\\configfiles\\basefile");
			prop= new Properties();
			prop.load(file);
		}
		if(prop.getProperty("Browser").contains("Chrome")) {
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("headless");
//			d = new ChromeDriver(co);
//			d.manage().window().setSize(new Dimension(1440,900));
			d = new ChromeDriver();
			d.get(prop.getProperty("BaseURL"));
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}
    }
	
    @AfterSuite
    public void depreciate() {
    	d.quit();
    }
	
    
}
