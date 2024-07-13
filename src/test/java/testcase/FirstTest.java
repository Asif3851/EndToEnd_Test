package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CartPage;
import pages.LoginPage;
import pages.PaymentAge;
import pages.ProductsPage;

public class FirstTest extends BaseClass{

	@Test(priority = 0)
	public void systemTesting() throws InterruptedException {
		LoginPage lp =new LoginPage(d);
		ProductsPage pp =lp.login("aa@example.com", "Aliasif9@");
		pp.add_productto_cart();
		CartPage cp = pp.click_cart_Button();
		Boolean tof = cp.verify();
		Assert.assertTrue(tof);
		PaymentAge pay= cp.checkout();
		pay.add_city();
	}
}
//Assertions.assertThat(listNotifications).hasSameElementsAs(myPage.verifyListNotificationType());


