package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");

		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("hari.radhakrishnan@qeagle.com");

		WebElement elePassword = driver.findElement(By.name("pw"));
		elePassword.sendKeys("TestLeaf$321");

		WebElement eleLogin = driver.findElement(By.id("Login"));
		eleLogin.click();
		driver.quit();



	}

}
