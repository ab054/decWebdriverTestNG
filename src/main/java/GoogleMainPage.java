import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMainPage {

    WebDriver driver;

    String queryInputCSS = "#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input";

    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://google.com");
    }

    public void typeQuery(String textToType) {
        WebElement element = driver.findElement(By.cssSelector(queryInputCSS));
        element.sendKeys(textToType);
    }

    public void submitSearch() {
        WebElement element = driver.findElement(By.cssSelector(queryInputCSS));
        element.submit();
    }
}
