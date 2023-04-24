import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropDown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropDown = new Select(staticDropDown);
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption());
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption());
		dropDown.selectByValue("INR");
		System.out.println(dropDown.getFirstSelectedOption());
		
		
		
	}

}
