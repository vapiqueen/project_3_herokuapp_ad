import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ChromeBrowserTest {
    public static void main(String[] args) {


        //Setup Chrome Browser
        WebDriver driver = new ChromeDriver();

        //Open URL into Browser
        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);

        //Maximam Browser
        driver.manage().window().maximize();

        //Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Print the title of the page
         String title = driver.getTitle();
        System.out.println("Print the title of te page" + title);

        //Print the Current url
          String currentUrl = driver.getCurrentUrl();
        System.out.println("Print current Url" + currentUrl);

        //Print the page source
        String pageSource = driver.getPageSource();
        System.out.println("Print the pageSource" + pageSource);

        //Enter te username in username field
       WebElement username = driver.findElement(By.id("username"));
username.sendKeys("a1234@hotmail.com");

//Enter the password in password field
         WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Hello1111");

//Close the browser
        driver.close();
        }
    }
