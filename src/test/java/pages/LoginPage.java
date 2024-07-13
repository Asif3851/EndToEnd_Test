package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import abstractclass.reusecode;

public class LoginPage extends reusecode {
	WebDriver d;

	public LoginPage(WebDriver d) {
		super(d);
		this.d = d;
	}

	By username = By.id("userEmail");
	By userpass = By.id("userPassword");
	By login_button = By.id("login");

	public ProductsPage login(String s1, String s2) throws InterruptedException {
		d.findElement(username).sendKeys(s1);
		d.findElement((userpass)).sendKeys(s2);
		d.findElement(login_button).click();
		ProductsPage pp = new ProductsPage(d);
		return pp;
	}
}
