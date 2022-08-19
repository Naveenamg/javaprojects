package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("nmg8584@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("sachin09");
		//driver.findElement(By.name("login")).click();

		driver.get("https://uidai.gov.in/my-aadhaar/update-aadhaar.html");

		//boolean LogoStatus= driver.findElement(By.xpath("//a[@aria-label='Home']")).isDisplayed();
		boolean LogoStatus= driver.findElement(By.className("logo-xs")).isDisplayed();

		System.out.println(LogoStatus);



}

}
