package front.customMadeTests.front.pageObject;

import front.customMadeTests.front.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static front.customMadeTests.constants.Constant.Urls.FRONT_MAIN_PAGE;

public class LandingPage  extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver); }

    //Main page button for page Custom made
    private final By btnCustomMade = By.xpath("//p[contains(text(), 'Custom Made')]");

    //pop up(region) close button
    private final By btnPopUpRegionClose = By.xpath("//*[@class='btn-close cookies__close-btn js-decline-country-change']");

    //pop up(cookies) close button
    private final By btnPopUpCookiesClose = By.xpath("//*[@class='cookies__close-icon susu-icon susu-icon-close']");






    public void open(){
        BasePage basePage = new BasePage(driver);
        basePage.open(FRONT_MAIN_PAGE);
    }

    public WebElement btnCustomMadeFind() {
        WebElement btnCustomMadeFind = driver.findElement(btnCustomMade);
        waitElementIsVisible(btnCustomMadeFind);
        return btnCustomMadeFind;
    }

    public void btnCustomMadeClick() {
        waitElementClickable(btnCustomMadeFind());
        btnCustomMadeFind().click(); }

    public void btnPopUpRegionCloseClick() {
        try{
        WebElement btnPopUpRegionCloseFind = driver.findElement(btnPopUpRegionClose);
        waitElementClickable(btnPopUpRegionCloseFind);
        btnPopUpRegionCloseFind.click();} catch (NoSuchElementException e) {
                e.printStackTrace();
            }
        }

    public void BtnPopUpCookiesCloseClick() {
        try{
        WebElement  BtnPopUpCookiesCloseFind = driver.findElement(btnPopUpCookiesClose);
        waitElementClickable(BtnPopUpCookiesCloseFind);
        BtnPopUpCookiesCloseFind.click();} catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }
}
