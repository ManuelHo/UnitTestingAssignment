import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchPage {
	
	private final WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        String baseUrl = "http://lisss.jku.at/";
    	driver.get(baseUrl + "/primo_library/libweb/action/search.do?vid=ULI");
        // Check that we're on the right page.
        if (!"JKU | LISSS".equals(driver.getTitle())) {
            throw new IllegalStateException("This is not the JKU | LISSS search page");
        }
    }
    
    public ResultsPage searchFor (String title) {
		driver.findElement(By.id("search_field")).clear();
		driver.findElement(By.id("search_field")).sendKeys(title);
		driver.findElement(By.id("goButton")).click();
		return new ResultsPage(driver);
    }

}


