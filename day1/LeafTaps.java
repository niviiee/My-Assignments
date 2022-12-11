package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement eleUser = driver.findElement(By.id("username"));

		eleUser.sendKeys("DemoSalesManager");

		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		elePassword.sendKeys("crmsfa");	

		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		driver.quit();

	}

}
