package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListImplInSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String noOfItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items are " + noOfItems);
		System.out.println();
		List<WebElement> brands = driver.findElements(
				By.xpath("//div[@class='item rilrtl-products-list__item item']//div//div[@class='brand']"));
		System.out.println("The number of Bag Brands are " + brands.size());
		System.out.println();
		System.out.println("The Brand Names are: ");
		for (WebElement brandName : brands) {
			System.out.println(brandName.getText());
		}
		System.out.println();
		List<WebElement> bagNames = driver.findElements(
				By.xpath("//div[@class='item rilrtl-products-list__item item']//div//div[@class='nameCls']"));
		System.out.println("The number of Bags are " + bagNames.size());
		System.out.println();
		System.out.println("The Bag Names are: ");
		for (WebElement name : bagNames) {
			System.out.println(name.getText());
		}
	}
}
