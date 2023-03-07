package tests.base;

import commons.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.listing.RealtListingPage;
import pages.realt_home.RealtHomePage;

import static commons.Config.CLEAR_COOKIES_AND_STORAGE;
import static commons.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage = new RealtListingPage(driver);


    @AfterTest
    public void clearCookiesAndLocalStorage() {
       if (CLEAR_COOKIES_AND_STORAGE) {
           driver.manage().deleteAllCookies();

       }
    }

    @AfterSuite (alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
