package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Validate_Password_recovery_functionality {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://accounts.lambdatest.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//for Forget Password
		driver.findElement(By.linkText("Forgot Password?")).click();
		Thread.sleep(2000);
		//Enter the recovery emailID
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ashwininandane03@gmail.com");
//Click the submit button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		// Recovery Code Page Url 
	String URL=	driver.getCurrentUrl();
	System.out.println(URL);
	
}
}