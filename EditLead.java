package week2day1Assignmt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(200);
		
		driver.manage().window().maximize();
		
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

		WebElement description = driver.findElement(By.name("description"));
		description.sendKeys("completedcourseonn2017");
		

		driver.findElement(By.name("primaryEmail")).sendKeys("hema96.cse@gmail.com");

		driver.findElement(By.className("smallSubmit")).click();

		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.name("description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("its important to fill");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
		
		

	}

}
