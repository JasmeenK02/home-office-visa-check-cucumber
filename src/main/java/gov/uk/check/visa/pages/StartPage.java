package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Start now']")
    WebElement startButton;






    public void acceptAllCookies(){
        try{
        driver.findElement(By.xpath("//button[contains(text(),'Accept additional cookies')]")).click();

    }catch (StaleElementReferenceException e) {
    }

        log.info("Accept all cookies" + acceptAllCookies.toString());
    }

    public void clickOnStartButton() {
        try{
            driver.findElement(By.xpath("//a[normalize-space()='Start now']")).click();

        }catch (StaleElementReferenceException e) {
        }

       log.info("Click on Start button" + startButton.toString());

        // clickOnElement(startButton);
    }


}
