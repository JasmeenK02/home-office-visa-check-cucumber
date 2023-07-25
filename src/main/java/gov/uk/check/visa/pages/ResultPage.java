package gov.uk.check.visa.pages;

import com.aventstack.extentreports.Status;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK']")
    WebElement resultMessageTourism;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care']")
    WebElement resultMessageHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa']")
    WebElement resultMessageFamilyStay;


    public String getResultMessageTourism(){
        log.info("Get message for tourism visa" + resultMessageTourism.toString());

        return getTextFromElement(resultMessageTourism);
    }

    public String getResultMessageHealthcare() {
        log.info("Get message for Health Care visa" + resultMessageHealthCare.toString());

        return getTextFromElement(resultMessageHealthCare);
    }

//    public void confirmResultHealthcare(String expectedMessage) {
//        log.info("Compare the health care visa message");
//        Assert.assertTrue(expectedMessage.equals(getResultMessageHealthcare()));
//
//    }

    public String getResultMessageFamilyStay() {
        log.info("Get message for family stay visa" + resultMessageFamilyStay.toString());

        return getTextFromElement(resultMessageFamilyStay);
    }

//    public void confirmResultFamilyStay(String expectedMessage) {
//        log.info("Compare the family stay visa message");
//        Assert.assertTrue(expectedMessage.equals(getResultMessageFamilyStay()));
//
//    }
}



