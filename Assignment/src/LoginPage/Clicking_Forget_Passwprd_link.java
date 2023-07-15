package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Clicking_Forget_Passwprd_link {
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
		
		//URL of Recovery Page
		String title_Of_new_tab=driver.getCurrentUrl();
		System.out.println(title_Of_new_tab);
		String expected_Title="https://accounts.lambdatest.com/password/reset";
		
		if(expected_Title.equals(title_Of_new_tab)) 
		{
			System.out.println("Password Recovery page open");
		}
		else {
			System.out.println("Password Recovery page does not open");
}
		}}
