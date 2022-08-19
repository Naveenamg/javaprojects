package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class url {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fancode.com");
		driver.findElement(By.xpath("//a[text()='SCHEDULE']")).click();
		
		String expectedURL="https://www.fancode.com/cricket/schedule/today";
		String actualURL=driver.getCurrentUrl();
		
	   if (actualURL.equals(expectedURL)) {
		   System.out.println("pass");
	} else {
		System.out.println("fail");

	}
	}
}
