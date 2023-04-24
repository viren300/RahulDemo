import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.id("checkBoxOption1")).click();
Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());

driver.findElement(By.id("checkBoxOption1")).click();
Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

System.out.println(driver.findElements(By.cssSelector("*[type='checkbox']")).size());


	}

}
