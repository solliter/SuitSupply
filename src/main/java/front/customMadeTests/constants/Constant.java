package front.customMadeTests.constants;


import java.time.Duration;

public class Constant {
    public static class TimeOutVariables{
        public static final Duration IMPLICIT_WAIT = Duration.ofSeconds(10);
        public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);

    }

    public static class Configuration {
        /*
         * Clear browser cookies on each iteration
         * if TRUE - clear cookies
         * */
        public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
        /*
         * To keep the browser open after test
         * if true - browser close
         * */
        public static final Boolean HOLD_BROWSER_OPEN = true;
    }

    public static class Urls{

        public static final String FRONT_MAIN_PAGE = "https://suitsupply.com/en-nl/";
        public static final String CUSTOM_MADE_PAGE = "https://suitsupply.com/en-nl/journal/custom-made.html";
        public static final String CART_CHECKOUT = "https://suitsupply.com/en-nl/cart";


    }
    public static class Variables {

        //fancy MildGreenPureWool price
        public static final String coatMildGreenPureWoolPrice = "€449";

        //urls

        public static final String urlEndSizeSection = "SizeSection";



    }

}
