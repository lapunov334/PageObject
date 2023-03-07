package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.id("rooms");
    private final By optionsRooms = By.xpath("//*[@id=\"rooms\"]/option[3]");
    private final By findBtn  = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms() {
        driver.findElement(countRooms).click();
        driver.findElement(optionsRooms).click();

        return this;
    }

    public RealtHomePage clickToFind() {
        WebElement btnFind = driver.findElement(findBtn);
        waitElementVisible(btnFind).click();

        return this;
    }


}
