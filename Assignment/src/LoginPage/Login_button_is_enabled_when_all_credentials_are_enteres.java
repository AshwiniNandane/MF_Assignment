package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_button_is_enabled_when_all_credentials_are_enteres {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://accounts.lambdatest.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//for EmailID
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwininandane03@gmail.com");
		Thread.sleep(1000);
		//For Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@123");
		Thread.sleep(1000);
		//For Log in button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Login button is Enabled
				WebElement result=driver.findElement(By.xpath("//button[@type='submit']"));
				if (result.isEnabled())
				{
					System.out.println("Login button Is enabled");
				}
				else {
					System.out.println("Login button is disabled");
				}
		}}

