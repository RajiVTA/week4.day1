package week4.day1.homework;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAlert {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node01uchomb9dxu9r44hnc5vr79fp344596.node0");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 1. Alert -Simple dialog
		driver.findElement(By.xpath("//h5[text()=' Alert (Simple Dialog)']/following-sibling::button")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		// 2. Alert - Confirm dialog
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button")).click();
		alert.accept();
		
		// 3. Sweet Alert (Simple Dialog)
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Simple Dialog)']/following-sibling::button")).click();
		//alert.accept();
		driver.findElement(By.xpath("//span[@class='ui-dialog-title']/following-sibling::a[@aria-label='Close']")).click();
		
		// 4. Sweet Modal dialog
		driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following-sibling::button")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		
		// 5. Alert (Prompt Dialog)
		
		driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
		alert.sendKeys("Eswari");
		alert.accept();
		
		// 6. Sweet Alert - Confirmation
		driver.findElement(By.xpath("//h5[text()='Sweet Alert (Confirmation)']/following-sibling::button")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt108']//span[text()='Yes']")).click();
		
		// 7. Min and Max
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following-sibling::button")).click();
		driver.findElement(By.xpath("//h5[text()='Minimize and Maximize']/following-sibling::div/div/span/following-sibling::a/span[@class='ui-icon ui-icon-extlink']")).click();
		
		//driver.findElement(By.xpath("(//span[contains(@class,'ui-icon-closethick')])[2]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-newwin']")).click();
		Thread.sleep(5000);
		//Maximize
		driver.findElement(By.xpath("//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-maximize ui-corner-all']")).click();
		Thread.sleep(5000);
		//Minimize
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		Thread.sleep(5000);
		//Close
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();

	}

}
