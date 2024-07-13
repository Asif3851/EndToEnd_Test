package abstractclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class reusecode {
    WebDriver d;
	public reusecode(WebDriver d) {
		this.d = d;
	}
	public void waits(WebElement abc) {
		WebDriverWait w= new WebDriverWait(d, Duration.ofSeconds(2000)); 
		w.until(ExpectedConditions.visibilityOf(abc));
	}
}
