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


public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    public SelectNationalityPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(tagName = "select")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;


    public void selectNationality(String nationality){
        try{
            driver.findElement(By.tagName("select")).click();

        }catch (StaleElementReferenceException e) {
        }

        log.info("Select nationality from dropdown list" + nationality + "from drop down" + nationalityDropDownList.toString());

//        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
    }
    public void clickNextStepButton(){
        try{
            driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();

        }catch (StaleElementReferenceException e) {
        }

        log.info("click on continue button" + nextStepButton.toString());

       // clickOnElement(nextStepButton);
    }
}
