package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button {

	public static void main(String[] args) {
		//driver setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");

		//verify url
		String currentPageTitle=driver.getTitle();
		driver.findElement(By.xpath("//span[text()='Click']")).click();

		String titleAfterClick = driver.getTitle();
		if(currentPageTitle.equals(titleAfterClick)==false) {

			System.out.println("click successfull");
		}else {
			System.out.println("click is not successfull");
		}
		//navigate back
		driver.navigate().back();

		//verify button is disabled
		WebElement disabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
		if(disabled.isEnabled()==false) {
			System.out.println("the button is disabled");
		}else {
			System.out.println("the button is enabled");
		}
		//print position
		WebElement submit = driver.findElement(By.xpath("//h5[contains(text(),'Find the position of the Submit button')]/following-sibling::button"));
		System.out.println(submit.getLocation());

		//print size
		WebElement submitSize = driver.findElement(By.xpath("//h5[contains(text(),'Find the height and width of this button')]/following-sibling::button"));
		System.out.println(submitSize.getSize());
		//print number of rounded button:
		List<WebElement> buttons = driver.findElements(By.xpath("//h5[contains(text(),'How many rounded buttons are there?')]/following-sibling::button"));
		System.out.println(buttons.size());
	}

}
