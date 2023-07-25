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


public class ReasonForTravelPage extends Utility {

    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

//    @CacheLookup
//    @FindBy(xpath = "//input[@id='response-0']")
//    WebElement tourism;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;



    public void selectReasonForVisit(String reason){

        try{
            driver.findElement(By.xpath("//div[@class='gem-c-radio govuk-radios__item']")).click();

        }catch (StaleElementReferenceException e) {
        }
        //clickOnElement(tourism);

        log.info("Select reason for visit");

    }

    public void clickNextStepButton(){

        log.info("Click on Continue button" + nextStepButton.toString());
        clickOnElement(nextStepButton);

    }

}
