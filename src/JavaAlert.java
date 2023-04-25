import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaAlert {
	public static void main(String[] args) {
		String text = "Viru";
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id=alertbtn]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id=alertbtn]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println("Changes done after the new branch");
		System.out.println("Changes made by GitStuff---");

	}

}
