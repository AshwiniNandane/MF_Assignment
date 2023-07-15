package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Login_with_invalid_credentials {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashwi\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://accounts.lambdatest.com/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//for EmailID (Invalid email)
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ashwininandane@gmail.com");
		Thread.sleep(1000);
		//For Password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password@23");
		Thread.sleep(1000);
		//For Log in button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Error message Displayed
		WebElement e=driver.findElement(By.xpath("//p[@class='text-red-700 text-size-10 mt-10']"));
		System.out.println(e.isDisplayed());
	}}

