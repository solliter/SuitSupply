package front.customMadeTests;

import front.BaseFrontTest;
import org.testng.annotations.Test;
import static front.customMadeTests.constants.Constant.Urls.*;
import static front.customMadeTests.constants.Constant.Variables.*;


public class customMadeHappyFlowTest  extends BaseFrontTest {


    @Test
    public void customMadeCoatHappyPass() throws Exception {
        landingPage.open();
        helpers.checkUrl(FRONT_MAIN_PAGE);
        landingPage.BtnPopUpCookiesCloseClick();
        landingPage.btnPopUpRegionCloseClick();
        helpers.scrollToElement(landingPage.btnCustomMadeFind());
        landingPage.btnCustomMadeClick();
        helpers.checkUrl(CUSTOM_MADE_PAGE);
        helpers.scrollToElement(customMadePage.btnCoatDesigningFind());
        customMadePage.btnCoatDesigningClick();
        customMadeApplicationPage.btnCloseNewForYouClick();
        customMadeApplicationPage.btnMildGreenPureWoolClick();
        helpers.checkText(customMadeApplicationPage.totalPriceFind(), coatMildGreenPureWoolPrice);
        customMadeApplicationPage.btnSizeSectionClick();
        helpers.checkUrlEnds(urlEndSizeSection);
        customMadeApplicationPage.btnSizePassportStartClick();
        customMadeApplicationPage.btnSelectSizeDropdownClick();
        customMadeApplicationPage.btnSelectSizeSmallestSizeClick();
        customMadeApplicationPage.btnSelectSizeClick();
        customMadeApplicationPage.btnSaveSizeAndContinueClick();
        customMadeApplicationPage.btnApplySizeClick();
        customMadeApplicationPage.btnAddToCart();
        helpers.checkText(cartPage.totalPriceFind(),coatMildGreenPureWoolPrice);
        helpers.checkUrl(CART_CHECKOUT);
    }
}
