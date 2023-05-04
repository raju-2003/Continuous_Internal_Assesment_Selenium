package continuous_internal_assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CIA_1_1_4 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("fossil watches");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.in/Fossil-Smartwatch-SnapdragonSmartphone-Notifications/dp/B09DGS966L/ref=sr_1_25?crid=2LOQNXJII74SZ&keywords=fossil+watches&qid=1681295284&sprefix=fossil+watche%2Caps%2C405&sr=8-25") ;
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"authportal-main-section\"]/div[2]/div/div[1]/form/div/div/div/h1"));
		String actual=ele.getText();
		System.out.println("Checkout page");
		String expected="Sign in";
		if(actual.equals(expected)) {
		System.out.print("24,000");
		}

	}

}
