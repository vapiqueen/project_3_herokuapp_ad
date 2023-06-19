package project_3_com_herouapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";

    //Setup a baseurl
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    static WebDriver driver;

    //Main method with if else condition
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser Name.");

            //Open URL
            driver.get(baseUrl);

            //Maximise Browser
            driver.manage().window().maximize();

            //Implicit wait driver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            //Print the title of the page
            String title = driver.getTitle();
            System.out.println("Title of the page" + title);

            //Print the current url
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL of the page" + currentUrl);

            //Print the page source
            String pageSource = driver.getPageSource();
            System.out.println("Page Source is" + pageSource);

            //Enter the Username in username field
            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("ad1234@hotmail.com");

            //Enter the password in password field
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("Hello1111");

            //Close the browser
            driver.close();

        }



    }
}