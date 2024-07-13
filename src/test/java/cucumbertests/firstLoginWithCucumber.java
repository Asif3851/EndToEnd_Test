package cucumbertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class firstLoginWithCucumber extends BaseClass{
	WebDriver d;
	@Given("login page url")
	public void launch() {
		d= new ChromeDriver();
		d.get("https://rahulshettyacademy.com/client");
	}
	@When("^login use username (.+) and Password (.+)$")
		public void login(String username ,String Password) throws InterruptedException {
		LoginPage lp =new LoginPage(d);
		lp.login(username, Password);
		}
	@Then("Login sucsessful")
	public void confirm() {
		System.out.println("Done with login");
		d.quit();
	}
	
}
