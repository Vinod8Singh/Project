package Demo.Demo1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
	 WebDriver driver;
	@Test
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("ipad");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li/div/a/div[2]/span"));
		int count=list.size();
		System.out.print("my count: "+ count);
		list.get(count-7).click();
		String mainpage=driver.getWindowHandle();
		System.out.println("main page=:"+mainpage);
		driver.findElement(By.xpath("//img[@alt='Apple iPad (9th Gen) 64 GB ROM 10.2 inch with Wi-Fi Only (Silver)']")).click();
		Set<String> allpages=driver.getWindowHandles();
		for(String page:allpages) {
			if(!page.equals(mainpage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input ]")).sendKeys("123456789");

		
		
		
		
		
		}
//	@Test
//	public void login() {
//		driver.findElement(By.xpath("//*[@class='_1fqY3P']/span")).sendKeys("vinodk123@gmail.com");
//		
		
	}



