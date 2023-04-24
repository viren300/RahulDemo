import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class IncrementDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

		// System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		int checkBoxList = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		Assert.assertEquals(checkBoxList, 6);

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {

			System.out.println("it is enabled");
			Assert.assertTrue(true);
		} else
			System.out.println("it is not enabled");
		{
			Assert.assertFalse(false);
		}

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(3000);
		/*
		 * int i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		for (int j = 1; j < 5; j++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}

}
