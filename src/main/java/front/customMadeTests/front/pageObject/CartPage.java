package front.customMadeTests.front.pageObject;

import front.customMadeTests.front.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver); }


    private final By totalPrice = By.xpath("//*[@class='cart__totals-value cart__totals-value--bold js-cart-summary-total']");


    public WebElement totalPriceFind() {
        WebElement btnCustomMadeFind = driver.findElement(totalPrice);
        waitElementIsVisible(btnCustomMadeFind);
        return btnCustomMadeFind;
    }

}
