package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveyPageNo {
    WebDriver driver;

    @FindBy(id="forward-btn_label")
    public WebElement ContinueButtonOne;

    @FindBy(id="Q1-R2-r-rad")
    public WebElement NoRadio;

    @FindBy(id="forward-btn_label")
    public WebElement ContinueButtonTwo;

    //@FindBy(id="Q2-ta")
    //public WebElement CommentTextBox;

    @FindBy(id="Q2-ta")
    public WebElement ContinueButton;

    @FindBy(className = "header-text")
    public WebElement surveyEndMsg;

    public SurveyPageNo(WebDriver driver){
        //this step to initialize the pagefactory
        //Page factory cannot be created here as it will be local .so we have to created global

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
    //actions
    //Thread.sleep(3000);
    public void clickContinueButtonOne(){
        ContinueButtonOne.click();
    }
    //Thread.sleep(3000);
    public void clickNoRadioButton()
    {
        NoRadio.isSelected();
    }
    //Thread.sleep(3000);
    //public void clickContinueButtonTwo(){
       // ContinueButtonTwo.click();
    //}
    //Thread.sleep(3000);
    //public void enterComment(String comment){
       // CommentTextBox.sendKeys(comment);
    //}
    public void surveyEndMsg(){
        surveyEndMsg.getText();

    }
}
