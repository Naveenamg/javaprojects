package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		String expectedText="Enter Time-Track";
		String actualText=driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]")).getText();

		Thread.sleep(20000);

		if (actualText.equals(expectedText)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

	}
}




