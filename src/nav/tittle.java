package nav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fancode.com");

		String expectedTitle ="Watch Live Cricket Streaming, Live Scores, IPL Match Stats, Videos, News & Tips | FanCode";
		String actualTitle=driver.getTitle();
	    
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Pass");
			
		} else {
			System.out.println("Fail");
	
	}
}


	}

