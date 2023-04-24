import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j = 0;
		WebDriver driver = new EdgeDriver();

		String[] purchaseProduct = { "Cucumber", "Brocolli", "Beetroot","Tomato" };
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < product.size(); i++) {

			String[] productName = product.get(i).getText().split("-");
			String formattedProductName = productName[0].trim();

			List purchaseProductList = Arrays.asList(purchaseProduct);

			if (purchaseProductList.contains(formattedProductName)) {

				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();

				if (j == purchaseProduct.length) {
					break;
				}
			}
		}

	}

}
