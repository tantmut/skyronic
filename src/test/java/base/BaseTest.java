package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Utils;

public class BaseTest {

    protected WebDriver driver;
    protected Logger log;
    protected Utils utils;

    @BeforeTest(alwaysRun = true)
    public void init(ITestContext ctx) {

        log = LogManager.getLogger();

        utils = new Utils();

        BrowserDriverFactory factory = new BrowserDriverFactory(utils.getProperty("browser"), log);

        // Initialize browser
        driver = factory.createDriver();

        // Maximize browser
        driver.manage().window().maximize();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        // Close browser
        driver.quit();
    }
}
