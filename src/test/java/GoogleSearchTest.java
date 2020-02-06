import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    //TODO: parametrize your existing tests
    @Parameters({"queryTextParameter"})
    @Test
    public void test0001(String parameter1) {
        String queryText = parameter1;
        GoogleMainPage mainPage = new GoogleMainPage(driver);
        GoogleResultsPage resultsPage = new GoogleResultsPage(driver);

        mainPage.open();
        mainPage.typeQuery(queryText);
        mainPage.submitSearch();
        resultsPage.waitForResultsPage();
        resultsPage.assertResultsPage();
    }

}
