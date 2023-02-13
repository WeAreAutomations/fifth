import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

    // Инициализируем Webdriver при помощи модификатора доступа public Static, для автоматического использования в других классах
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        // set up Chrome driver
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
//        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Thread.sleep(2500);
        driver.get("https://www.google.com");
        driver.quit();


    }
}
