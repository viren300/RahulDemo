import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsActivity {
public static void main(String[] args) {
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
	driver.navigate().back();
	driver.navigate().forward();
	
	
}
}
