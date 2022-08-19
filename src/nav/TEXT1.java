package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEXT1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.fancode.com");


			String expectedText="Featured Matches";
			String actualText=driver.findElement(By.xpath("//div[contains(text(),'Featured Matches')]")).getText();


			if (actualText.equals(expectedText)) {
				System.out.println("pass");
			} else {
				System.out.println("fail");

			}
		}


	}

