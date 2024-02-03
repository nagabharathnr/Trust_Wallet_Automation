import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateWallet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("chrome-extension://egjidjbpglichdcondbcbdnbeeppgdph/home.html#/onboarding");

	}

}
