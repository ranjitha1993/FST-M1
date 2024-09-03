package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity9 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println("Home page title: " + driver.getTitle());

		driver.findElement(By.cssSelector("button.violet")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);

		WebElement delayedText = driver.findElement(By.tagName("h3"));
		System.out.println(delayedText.getText());

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
		String lateText = driver.findElement(By.tagName("h3")).getText();
		System.out.println(lateText);

		driver.quit();
	}
}
