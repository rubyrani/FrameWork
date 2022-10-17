package rahulSethyAcademy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("rubyrani613@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Ruby@1989");
		driver.findElement(By.name("login")).click();
		List<WebElement> listProduct = driver.findElements(By.cssSelector(".col-lg-4 "));
		System.out.Print("hello github");
		
	}

}
