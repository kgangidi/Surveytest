package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.SurveyPage;
import pageObjects.SurveyPageNo;

public class BasePage {
    public static WebDriver driver;
    public static SurveyPage surveyPage;
    public static SurveyPageNo surveyPageNo;

    @Before
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        surveyPage = new SurveyPage(driver);
        surveyPageNo= new SurveyPageNo(driver);

    }

   // homePage = new HomePage(driver);

    public static void navigateToUrl(String url) {
        driver.navigate().to(url);
    }

    @After
    public static void tearDown() {
        driver.quit();
    }
}