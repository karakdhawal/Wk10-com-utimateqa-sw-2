package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*2. Create the package ‘testsuite’ and create the following class inside the ‘testsuite’ package.
1. LoginTest
 */
public class LoginTest extends BaseTest {

    String baseUrl = "https://courses.ultimateqa.com/";

    @Before
    public void setup (){
        openBrowser(baseUrl);
    }
    @Test
    /*
    3. Write down the following test into ‘LoginTest’ class
    1. userShouldNavigateToLoginPageSuccessfully * click on the ‘Sign In’ link * Verify the text ‘Welcome Back!’
     */
    public void userShouldNavigateToLoginPageSuccessfully () {
        WebElement signin = driver.findElement(By.xpath("//li[@class ='header__nav-item header__nav-sign-in']"));
        signin.click();
        WebElement mes = driver.findElement(By.xpath("//h1[@class ='page__heading']"));
        String actualmes = mes.getText();
        System.out.println(actualmes);
        String expectedmes = "Welcome Back!";
        Assert.assertEquals(expectedmes,actualmes);
    }
    @Test
    /*2. verifyTheErrorMessage * click on the ‘Sign In’ link
    * Enter invalid username * Enter invalid password
    * Click on Login button * Verify the error message ‘Invalid email or password.’
     */
        public void verifyTheErrorMessage () {
        WebElement signin = driver.findElement(By.xpath("//li[@class ='header__nav-item header__nav-sign-in']"));
        signin.click();
        WebElement username = driver.findElement(By.xpath("//input[@id ='user[email]']"));
        username.sendKeys("lord@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@id ='user[password]']"));
        password.sendKeys("1234");
        WebElement signinbutton = driver.findElement(By.xpath("//input[@class='button button-primary g-recaptcha']"));
        signinbutton.click();
        WebElement errormes = driver.findElement(By.xpath("//li[@class='form-error__list-item']"));
        String actualmes = errormes.getText();
        System.out.println(actualmes);
        String expectedmes = "Invalid email or password.";
        Assert.assertEquals(expectedmes,actualmes);

    }

    @After
    public void teardown (){
        closebrowser();
    }

}
