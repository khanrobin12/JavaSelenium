package LaunchBrowsers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com"); // page will wait until the elements load.

		// driver.navigate().to("http://www.google.com"); // page will not wait for the
		// web element.

		String title = driver.getTitle(); // get page title.
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("In-correct title");
		}

		// driver.navigate().back(); // navigate back.

		// driver.navigate().forward(); // navigate forward.

		String url = driver.getCurrentUrl(); // get current page URL.
		System.out.println(url);

		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Ali noor");

		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/button"))
				.click();

	}

}
