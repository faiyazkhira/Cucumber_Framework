package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchToChildWindow() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String landingId = it.next();
		String offersId = it.next();
		driver.switchTo().window(offersId);
	}
}
