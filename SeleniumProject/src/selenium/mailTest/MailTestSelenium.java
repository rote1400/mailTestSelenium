package selenium.mailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailTestSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MIUN\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize(); // Maximize browser window
		
		driver.findElement(By.xpath("//button[@jsname='Cuz2Ue']")).click(); // Press Forgotten mail
		Thread.sleep(1000); // Pause execution for 1 second
		
		driver.findElement(By.id("recoveryIdentifierId")).sendKeys("mail@gmail.com"); // Fill mail
		Thread.sleep(1000); // Pause execution for 1 second
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "gmail";
		driver.quit(); // Close browser
		
		// Test case QA
		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Successful");
		}
		else {
			System.out.println("Not successful");
		}
	}

}
