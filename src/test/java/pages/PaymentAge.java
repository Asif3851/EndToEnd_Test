package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import abstractclass.reusecode;

public class PaymentAge extends reusecode {
	WebDriver d;

	public PaymentAge(WebDriver d) {
		super(d);
		this.d = d;
	}
    By select = By.xpath("//input[@placeholder='Select Country']");
	public void add_city() {
        waits(d.findElement(select));
		d.findElement(select).sendKeys("indi");
		d.findElement(By.xpath("(//span[@class='ng-star-inserted'])[2]")).click();
		d.findElement(By.xpath("//a[text()='Place Order ']")).click();
	}
}
