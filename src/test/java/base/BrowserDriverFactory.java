package base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserDriverFactory {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private String browser;

    private Logger log;

    public BrowserDriverFactory(String browser, Logger log) {
        this.browser = browser.toLowerCase();
        this.log = log;
    }

    public WebDriver createDriver() {
        log.info("Create drive: " + browser);

        switch (browser) {

            case "chrome_linux_80":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_linux_80");
                driver.set(new ChromeDriver());
                break;

            case "chrome_linux_81":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_linux_81");
                driver.set(new ChromeDriver());
                break;

            case "chrome_linux_83":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_linux_83");
                driver.set(new ChromeDriver());
                break;

            case "chrome_linux_84":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_linux_84");
                driver.set(new ChromeDriver());
                break;

            case "chrome_mac_80":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_mac_80");
                driver.set(new ChromeDriver());
                break;

            case "chrome_mac_81":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_mac_81");
                driver.set(new ChromeDriver());
                break;

            case "chrome_mac_83":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_mac_83");
                driver.set(new ChromeDriver());
                break;

            case "chrome_mac_84":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_mac_84");
                driver.set(new ChromeDriver());
                break;

            default:
                log.info("Do not know how to start: " + browser + ", starting chrome.");
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome_linux_80");
                driver.set(new ChromeDriver());
                break;
        }
        return driver.get();
    }
}
