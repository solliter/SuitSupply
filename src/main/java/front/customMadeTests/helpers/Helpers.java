package front.customMadeTests.helpers;

import front.customMadeTests.front.methods.BasePage;
import org.awaitility.Awaitility;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static front.customMadeTests.constants.Constant.TimeOutVariables.IMPLICIT_WAIT;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Helpers extends BasePage {
    protected WebDriver driver;

    public Helpers(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    // Method to scroll down to specific element
    public void scrollToElement(WebElement element) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(600);
    }

    public void checkUrl(String url){
    String strUrl = driver.getCurrentUrl();
    Awaitility.given().ignoreException(AssertionError.class)
                .await().pollInterval(5, TimeUnit.MILLISECONDS).atMost(10, TimeUnit.SECONDS)
                .until(() -> strUrl.equals(url));
    assertThat(strUrl, is(url));
    }

    public void checkUrlEnds(String url){
        String strUrl = driver.getCurrentUrl();
        Awaitility.given().ignoreException(AssertionError.class)
                .await().pollInterval(5, TimeUnit.MILLISECONDS).atMost(10, TimeUnit.SECONDS)
                .until(() -> strUrl.endsWith(url));
    }

    public void checkText(WebElement elementsToFind, String elements){
        waitElementIsVisible(elementsToFind);
        assertThat(elementsToFind.getText(), is(elements));
    }

}
