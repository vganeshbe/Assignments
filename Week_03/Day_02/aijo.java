package Week3.Day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aijo {

	public WebDriver LoginPage() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		return (driver);
	}

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws InterruptedException {
		aijo objAijo = new aijo();
		WebDriver getDriver = objAijo.LoginPage();

		getDriver.get("https://www.ajio.com/");
		getDriver.manage().window().maximize();

		getDriver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		getDriver.findElement(By.xpath("//label[@for='Men']")).click();

		Thread.sleep(2000);
		getDriver.findElement(By.xpath("//label[contains(@for,'Fashion Bags')]")).click();

		Thread.sleep(2000);
		WebElement elementNoOfItems = getDriver.findElement(By.xpath("//div[@class='length']"));
		System.out.println(elementNoOfItems.getText());

		List<WebElement> elementBrands = getDriver.findElements(By.xpath("//div[@class='brand']"));

		for (WebElement brands : elementBrands) {
			System.out.println(brands.getText());
		}

		int size, noItems;
		size = getDriver.findElements(By.xpath("//div[@Class='nameCls']")).size();
		noItems = Integer.parseInt(elementNoOfItems.getText().replaceAll("\\D+", ""));

		while (noItems != size) {
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) getDriver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			size = getDriver.findElements(By.xpath("//div[@Class='nameCls']")).size();
		}

		Thread.sleep(2000);
		List<WebElement> elementsBagName = getDriver.findElements(By.xpath("//div[@Class='nameCls']"));

		int i = 0;
		for (WebElement bagNames : elementsBagName) {
			i++;
			System.out.println(i + ") " + bagNames.getText());
		}

	}

}
