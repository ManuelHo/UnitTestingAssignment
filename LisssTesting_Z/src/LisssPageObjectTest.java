import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LisssPageObjectTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void testSearchResultsForSoftwareTesting() {
		SearchPage searchPage = new SearchPage(driver);
		ResultsPage resultsPage = searchPage.searchFor("software testing");
		assertTrue("1.210".equals(resultsPage.getNumberOfResults()));
	}


}
