package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String url = "https://gozayaan.com/";

    public By hotel = By.xpath("//span[@class='product'][normalize-space()='Hotel']");
    public By hotelFrom = By.xpath("//span[normalize-space()='City/Hotel/Resort/Area']");
    public By searchBar = By.xpath("//input[@id='searchString']");
    public By selectDhaka = By.xpath("//div[@class='location-list']//div[2]//div[1]//div[1]");

    //Process with checkIN
    public By checkIn = By.xpath("//span[normalize-space()='Check In']");
    public By checkInDate = By.xpath("//div[@class='calendar left']//span[@class='day'][normalize-space()='7']");

    //Process with checkOut
    public By checkOut = By.xpath("//span[normalize-space()='Check Out']");
    public By checkOutDate = By.xpath("//div[@class='calendar left']//span[@class='day'][normalize-space()='10']");

    public By search = By.xpath("//button[normalize-space()='Search']");



}
