package tests.searchapartment;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectListing () {
        basePage.open(REALT_HOME_PAGE);

        realtHomePage
                .enterCountRooms()
                .clickToFind();

        String count = String.valueOf(realtListingPage.checkCounterCards());
        Allure.addAttachment("Количество объявлений на странице: ", count);
    }
}
