package nav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","D:\\softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file://D://NAVEEN/KK.html");
		
		boolean checkBoxStatus=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(checkBoxStatus);
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean checkBoxStatus1=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(checkBoxStatus1);
		  
	
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		boolean checkBoxStatus2=driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(checkBoxStatus2);

	}

}


