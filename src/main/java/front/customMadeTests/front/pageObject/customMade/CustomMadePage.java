package front.customMadeTests.front.pageObject.customMade;

import front.customMadeTests.front.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomMadePage extends BasePage {

    public CustomMadePage(WebDriver driver) {
        super(driver); }

    private final By btnCoatDesigning = By.xpath("//*[@data-promo-name='page-journal-custom_made-fastest_tailors-cm_coat']");

    public WebElement btnCoatDesigningFind() {
        WebElement btnCoatDesigningFind = driver.findElement(btnCoatDesigning);
        waitElementIsVisible(btnCoatDesigningFind);
        return btnCoatDesigningFind;
    }

    public void btnCoatDesigningClick() {
        waitElementClickable(btnCoatDesigningFind());
        btnCoatDesigningFind().click();
    }



}
