package week2day1Assignmt;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		Thread.sleep(200);
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemalatha");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Asokan");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
		
		driver.findElement(By.name("departmentName")).sendKeys("CSE");
		
		driver.findElement(By.name("description")).sendKeys("Hi , I have completed CSE in theyear of 2017");
		
		driver.findElement(By.name("primaryEmail")).sendKeys("hema96.cse@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
