package SeleniumPratice.SeleniumPratice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

     public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "loginButton")
    WebElement loginButton;

   
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String user) {
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPratice.SeleniumPratice.pages.LoginPage;

public class LoginTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            
            driver.get("YOUR_LOGIN_PAGE_URL");

           
            LoginPage loginPage = new LoginPage(driver);

         
            loginPage.login("Archana", "Test@123");

        } finally {
            driver.quit();
        }
    }
}