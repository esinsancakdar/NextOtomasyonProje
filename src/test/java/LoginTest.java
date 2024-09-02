import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
     @Test
        void network(){
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.network.com.tr");

            WebElement searchBox = driver.findElement(By.id("search")); searchBox.sendKeys("ceket");searchBox.submit();
          JavascriptExecutor js = (JavascriptExecutor) driver ;
         WebElement showMoreButton = driver.findElement(By.xpath(("//button[contains(text(), 'Daha Fazla Göster')]")));
          js.executeAsyncScript("arguments[0].scrollIntoView'(true);" );
          showMoreButton.click();



     }
}
