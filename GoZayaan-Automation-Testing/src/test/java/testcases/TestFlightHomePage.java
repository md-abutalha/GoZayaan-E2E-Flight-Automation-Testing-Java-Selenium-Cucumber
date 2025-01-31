package testcases;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.DriverSetup;

import java.time.Duration;

public class TestFlightHomePage extends DriverSetup {
    HomePage homePage = new HomePage();

    @Test(priority = 0, description = "GoZyaan Homepage")
    public void testHotelSearch() throws InterruptedException {
        getDriver().get(homePage.url);

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        homePage.clickElement(homePage.hotel);
        wait.until(ExpectedConditions.visibilityOf(homePage.clickElement(homePage.hotelFrom)));
        homePage.clickElement(homePage.searchBar);
        homePage.writeOnElement(homePage.searchBar,"Dhaka");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.selectDhaka)); // Change this as necessary
        Thread.sleep(4000);

        //Process with checkIn
        homePage.clickElement(homePage.checkIn);
        homePage.clickElement(homePage.checkInDate);
        Thread.sleep(4000);

        //Process with checkOut
        homePage.clickElement(homePage.checkOut);
        homePage.clickElement(homePage.checkOutDate);

        homePage.clickElement(homePage.search);
    }


}
