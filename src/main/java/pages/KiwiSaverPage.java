package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiwiSaverPage {

    public KiwiSaverPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//*[@id='ubermenu-section-link-kiwisaver-ps'][text()='KiwiSaver']")
//    public WebElement KiwiSaver;

    @FindBy(xpath = "//*[@id='ubermenu-section-link-kiwisaver-ps']")
    public WebElement KiwiSaver;

    @FindBy(xpath = "//*[@id='ubermenu-item-cta-kiwisaver-calculators-ps']")
    public WebElement KiwiSaverCalculators;

    @FindBy(xpath = "//*[@href='/kiwisaver/calculators/kiwisaver-calculator/']")
    public WebElement KiwiSaverCalculatorsClick;

    @FindBy(xpath = "//a[text()='Click here to get started.']")
    public WebElement startKiwiSaverCalculator;

    @FindBy(xpath = "//h1[text()='KiwiSaver Retirement Calculator']")
    public WebElement kiwiSaverCalculatorHeader;

//    @FindBy(xpath = "//i[@class='icon']/../../../div[@help-id='CurrentAge']/button[@type='button']")
//    public WebElement currentAgeHelp;

    @FindBy(xpath = "//button[@class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']/../../div[@help-id='CurrentAge']//i")
    public WebElement currentAgeHelp;

//    @FindBy(xpath = "//*[@class='wpnib-field-current-age field-group ng-isolate-scope']//button")
//    public WebElement currentAgeHelp;

    @FindBy(xpath =  "//div[@class='message-row ng-scope'][@ng-if='frameless']/div[@class='field-message message-info ng-binding']")
    public WebElement warningMessage;



}
