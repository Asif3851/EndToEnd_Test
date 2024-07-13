package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import abstractclass.reusecode;

public class CartPage extends reusecode {

	 WebDriver d;
		public CartPage(WebDriver d){
			super(d);
			this.d = d;
		}
		By prod_loading= By.xpath("//ul[@class='cartWrap ng-star-inserted']");
		
		public Boolean verify() throws InterruptedException {
			waits(d.findElement(prod_loading));
			List<WebElement> cart = d.findElements(By.xpath("//ul[@class='cartWrap ng-star-inserted']//h3"));
			Boolean b = cart.stream().anyMatch(cart01 -> cart01.getText().equalsIgnoreCase("ZARA COAT 3"));
			return b;
		}
		public PaymentAge checkout() {
			d.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			PaymentAge pay= new PaymentAge(d);
			return pay;
		}
}
//List<WebElement> cart = reusable_methods.products_list(By.xpath(loc.getProperty("list_of_cart_inventory")));
//Boolean b = cart.stream().anyMatch(cart01 -> cart01.getText().equalsIgnoreCase(str));

