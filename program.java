package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//
public class Faceebok {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
driver.get("https://www.facebook.com/");
	
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8197427020");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("7259307032");
	driver.findElement(By.cssSelector("button[value='1']")).click();