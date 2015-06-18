import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Parameterized.class)
public class LisssParameterizedTest {
	
	private WebDriver driver;
	
	private String searchTerm;
	
	private String numberOfResults;

     
     @Parameters
     public static Collection testValues() {
        return Arrays.asList(new Object[][] {
        		{ "cheese", "21" }, { "cake", "47" }, { "beer", "591" } });
     }


     public LisssParameterizedTest(String input, String expected) {
             searchTerm= input;
             numberOfResults= expected;
     }

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSearchResultsForSoftwareTesting() {
		SearchPage searchPage = new SearchPage(driver);
		ResultsPage resultsPage = searchPage.searchFor(searchTerm);
		assertTrue(numberOfResults.equals(resultsPage.getNumberOfResults()));
	}
	
	


}
