package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://login.salesforce.com/");
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		// driver.close();
		
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TATA Consultancy Services");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Chrissie");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Samraj");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cjoylin@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("07438879499");
		driver.findElement(By.className("smallSubmit")).click();

	}

}