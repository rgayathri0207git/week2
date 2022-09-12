package week2.day2;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookNewAccount {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("TestFirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("TestLastName");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("TestEmail@gmil.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Test@Password12");
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select day_drop = new Select(day);
		day_drop.selectByValue("1");
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select month_drop = new Select(month);
		month_drop.selectByVisibleText("Feb");
		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select year_drop = new Select(year);
		year_drop.selectByVisibleText("1990");

		driver.findElement(By.xpath("//label[text()=\"Female\"]")).click();
		//driver.close();
	}

}
