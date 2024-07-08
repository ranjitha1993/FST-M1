package demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://v1.training-support.net");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
