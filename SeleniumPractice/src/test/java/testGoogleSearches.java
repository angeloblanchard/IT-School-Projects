import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class testGoogleSearches extends TestCase
{
    WebDriver driver;

    // Tests where the title of the page contains the word sent by the element, and passes
    @Test
    public void testGoogleSearchPass()
    {
        driver = new HtmlUnitDriver();
        // go to google
        driver.get("http://www.google.com");

        // find text element by name
        WebElement element = driver.findElement(By.name("q"));

        // Search for llamas
        element.sendKeys("Llama");

        element.submit();

        System.out.println("Name of page title: " + driver.getTitle());

        assertTrue(driver.getTitle().contains("Llama"));

        driver.quit();
    }

    // Tests where the title of the page contains the word sent by the element, and fails
    @Test
    public void testGoogleSearchFail()
    {
        driver = new HtmlUnitDriver();
        // go to google
        driver.get("http://www.google.com");

        // find text element by name
        WebElement element = driver.findElement(By.name("q"));

        // Search for llamas
        element.sendKeys("Peppers");

        element.submit();

        System.out.println("Name of page title: " + driver.getTitle());

        assertTrue(driver.getTitle().contains("Llama"));

        driver.quit();
    }
}
