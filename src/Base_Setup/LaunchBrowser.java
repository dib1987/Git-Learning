package Base_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver_win32 (3)\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//changes in master //
		System.out.println("git learning");
		
		
		// new functionality //
		
		System.out.println("changes made by indian guy");
		
		// new functionality by canadian guy //
		System.out.println("candian guy changes ");
		
		System.out.println("bad changes pushed into origin ");
		
	}

}
