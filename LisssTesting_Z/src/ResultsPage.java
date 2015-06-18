import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ResultsPage {
	
	private final WebDriver driver;
	
	public ResultsPage(WebDriver driver) {
        this.driver = driver;
        // Check that we're on the right page.
        if (!driver.getTitle().startsWith("JKU | LISSS - Ergebnisse - ")) {
            throw new IllegalStateException("This is not the JKU | LISSS search page");
        }
    }
	
	public String getNumberOfResults() {
		return driver.findElement(
				By.xpath("//div[@id='resultsNumbersTile']/h1/em"))
				.getText();
	}
	
	public String getResultPageTitle() {
		return driver.getTitle();
	}
	
}
