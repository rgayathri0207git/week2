package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createLead {

	public static void main(String[] args) {

		//Driver Setu:

		WebDriverManager.chromedriver().setup();
		String driverPath = System.getProperty("webdriver.chrome.driver");
		System.out.println(driverPath);
		ChromeDriver driver=new ChromeDriver();

		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		//Login

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		//Home Page
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();

		//Create Lead:

		driver.findElement(By.linkText("Create Lead")).click();
		WebElement company_ele = driver.findElement(By.id("createLeadForm_companyName"));
		company_ele.sendKeys("XYZ");
		WebElement firstName_ele = driver.findElement(By.id("createLeadForm_firstName"));
		firstName_ele.sendKeys("Gayathri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrasekar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gayu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		WebElement SourceEle= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourcedropDown= new Select(SourceEle);
		sourcedropDown.selectByValue("LEAD_CONFERENCE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rgayathri0207@gmail.com");
		WebElement stateEle= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropDown= new Select(stateEle);
		stateDropDown.selectByValue("AL");
		WebElement createLeadSubmit = driver.findElement(By.className("smallSubmit"));
		createLeadSubmit.click();
		System.out.println(driver.getTitle());

		// Dupliacte Lead:

		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement Company = driver.findElement(By.id("createLeadForm_companyName"));
		Company.clear();
		Company.sendKeys("ABC");
		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		firstname.sendKeys("Gaya");

		//company_ele.clear();
		//company_ele.sendKeys("abc");
		//firstName_ele.clear();
		//firstName_ele.sendKeys("Gaya");
		//createLeadSubmit.click();
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());



		//driver.close();
	}

}
