import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertTrue;

public class GoogleResultsPage {

    WebDriver driver;

    By resultStatsLabel = By.id("resultStats");

    public GoogleResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForResultsPage() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultStatsLabel));
    }

    public void assertResultsPage() {
        WebElement resultsElement = driver.findElement(resultStatsLabel);
        boolean isResultStatsDisplayed = resultsElement.isDisplayed();
        assertTrue(isResultStatsDisplayed);
    }
}
