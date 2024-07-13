package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractclass.reusecode;

public class ProductsPage extends reusecode {
	WebDriver d;

	public ProductsPage(WebDriver d) {
		super(d);
		this.d = d;
	}

	By products_wait = By.cssSelector(".mb-3");
	By list = By.cssSelector(".mb-3");

	public void add_productto_cart() throws InterruptedException {
		waits(d.findElement(products_wait));
	    List<WebElement> products = d.findElements(list);
		WebElement prod = products.stream().filter(a -> a.findElement(By.tagName("b")).getText().equals("ZARA COAT 3")).findFirst()
				.orElse(null);
		prod.findElement(By.xpath("//button[@class='btn w-10 rounded']")).click();

	}
	public CartPage click_cart_Button() throws InterruptedException {
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='btn btn-custom'])[3]")).click();

		CartPage cp =new CartPage(d);
		return cp;
	}

}
