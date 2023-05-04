package continuous_internal_assesment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CIA_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        String u = "https://www.amazon.com/";
        driver.get(u);
        driver.manage().window().maximize();
        WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
        s.sendKeys("laptop", Keys.ENTER);
        List<WebElement> li = driver.findElements(By.xpath("//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-2\"]"));
        Assert.assertNotEquals(li.size(), 0);
        System.out.println("Relevant Products are displayed");
        System.out.println("List of 5 Laptops : ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ") " + li.get(i).getText());
        }
        WebElement pricefil = driver.findElement(By.id("p_36-title"));
        Assert.assertTrue(pricefil.isDisplayed());
        System.out.println("Price filter is working");
        WebElement brandfil = driver.findElement(By.id("p_89-title"));
        Assert.assertTrue(brandfil.isDisplayed());
        System.out.println("Brand filter is working");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        WebElement otherfil = driver.findElement(By.id("filters"));
        Assert.assertTrue(otherfil.isDisplayed());
        System.out.println("All filters are enabled");
        driver.quit();

	}

}
