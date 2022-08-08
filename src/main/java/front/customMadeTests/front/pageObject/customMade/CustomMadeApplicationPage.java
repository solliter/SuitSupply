package front.customMadeTests.front.pageObject.customMade;

import front.customMadeTests.front.methods.BasePage;
import org.openqa.selenium.*;
import io.github.sukgu.*;

public class CustomMadeApplicationPage extends BasePage {

    public CustomMadeApplicationPage(WebDriver driver) {
        super(driver); }

    Shadow shadow = new Shadow(driver);

    //close btn Popup new for you
    private final By btnCloseNewForYou = By.xpath("//*[@class='close border-solid size-small shape-round icon-only background-light hydrated']");


    public void btnMildGreenPureWoolClick() {
        WebElement elementBtn = shadow.findElement("ss-card[id='_7cdd7808-d1bf-431e-8bba-dabbee0d97a7']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public WebElement totalPriceFind() {
        WebElement elementBtn = shadow.findElement("span[class='price']");
        shadow.isVisible(elementBtn);
        return elementBtn;
    }

    public WebElement btnCloseNewForYouFind() {
        WebElement btnCloseNewForYouFind = driver.findElement(btnCloseNewForYou);
        waitElementIsVisible(btnCloseNewForYouFind);
        return btnCloseNewForYouFind;
    }

    public void btnCloseNewForYouClick() {
        try{
            WebElement btnPopUpRegionCloseFind = btnCloseNewForYouFind();
            waitElementClickable(btnPopUpRegionCloseFind);
            btnPopUpRegionCloseFind.click();} catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    public void btnSizeSectionClick() {
        WebElement elementBtn = shadow.findElement("a[id='SizeSection-link']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnSizePassportStartClick() throws Exception {
        shadow.setExplicitWait(6,1);
        shadow.setImplicitWait(1);
        WebElement elementLogo = shadow.findElement("h1[class='no-passport-header']");
        shadow.isVisible(elementLogo);
        WebElement elementBtn = shadow.findElement("ss-button[data-entry='continue']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnSelectSizeDropdownClick() {
        WebElement elementLogo = shadow.findElement("h2[class='h2 main-title']");
        shadow.isVisible(elementLogo);
        WebElement elementBtn = shadow.findElement("ss-button[class='border-solid dropdown selected size-regular shape-squared width-full background-light hydrated']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnSelectSizeSmallestSizeClick() {
        WebElement elementLogo = shadow.findElement("ss-button[class='border-solid dropdown selected size-regular shape-squared width-full background-light hydrated']");
        shadow.isVisible(elementLogo);
        WebElement elementBtn = shadow.findElement("ss-button[data-value='40']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnSelectSizeClick() {
        WebElement elementBtn = shadow.findElement("ss-button[automation-key-filter-id='SizePicker_SelectSize']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnSaveSizeAndContinueClick() {
        WebElement elementBtn = shadow.findElement("ss-button[automation-key-filter-id='SP_SaveAndContinue']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnApplySizeClick()  {
        WebElement elementBtn = shadow.findElement("ss-button[automation-key-filter-id='SP_Apply']");
        shadow.isVisible(elementBtn);
        elementBtn.click();
    }

    public void btnAddToCart() {
        WebElement elementBtn = shadow.findElement("ss-button[class='border-solid size-regular shape-squared width-full background-dark hydrated']");
        shadow.isVisible(elementBtn);
        elementBtn.click();

    }






}
