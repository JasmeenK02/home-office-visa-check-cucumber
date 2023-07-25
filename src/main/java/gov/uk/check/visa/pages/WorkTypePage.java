package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    //nextStepButton, selectJobtypeList locators and create methods  'void selectJobType(String job)'
    //  and 'void clickNextStepButton()'

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectJobTypeList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectJobType(String job) {
        log.info("Select the ob type" + selectJobTypeList.toString());
        clickOnElement(selectJobTypeList);

    }

    public void clickNextStepButton() {
        log.info("Click on continue button on reason for visit page" + nextStepButton.toString());
        clickOnElement(nextStepButton);

    }

}
