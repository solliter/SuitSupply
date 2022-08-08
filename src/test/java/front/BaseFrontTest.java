package front;

import front.customMadeTests.front.common.CommonAction;
import front.customMadeTests.front.pageObject.CartPage;
import front.customMadeTests.front.pageObject.LandingPage;
import front.customMadeTests.front.pageObject.customMade.CustomMadeApplicationPage;
import front.customMadeTests.front.pageObject.customMade.CustomMadePage;
import front.customMadeTests.helpers.Helpers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import static front.customMadeTests.constants.Constant.Configuration.CLEAR_COOKIES_AND_STORAGE;
import static front.customMadeTests.constants.Constant.Configuration.HOLD_BROWSER_OPEN;


public class BaseFrontTest {
    protected static WebDriver driver = CommonAction.createDriver();
    protected LandingPage landingPage = new LandingPage(driver);
    protected Helpers helpers = new Helpers(driver);
    protected CustomMadePage customMadePage = new CustomMadePage(driver);
    protected CustomMadeApplicationPage customMadeApplicationPage = new CustomMadeApplicationPage(driver);
    protected CartPage cartPage = new CartPage(driver);



    @AfterMethod(alwaysRun = true)
    public void clearCookiesAndLocalStorage(){
        if(CLEAR_COOKIES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterTest(alwaysRun = true)
    public void close(){
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }








}
