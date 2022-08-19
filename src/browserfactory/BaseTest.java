package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/*Project-5 - ProjectName : com-utimateqa-sw-2 BaseUrl = https://courses.ultimateqa.com/
 1. Create the package ‘browserfactory’ and create the class with the name ‘BaseTest’ inside the ‘browserfactory’ package.
  And write the browser setup code inside the class ‘Base Test’.
 */
public class BaseTest {
    public static WebDriver driver;

    public void openBrowser (String baseUrl) {
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    public void closebrowser (){
        driver.quit();
    }


}
