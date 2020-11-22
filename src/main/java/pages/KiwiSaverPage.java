package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiwiSaverPage {

    public KiwiSaverPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//*[@id='ubermenu-section-1010-6-ps']/div/a")
//    public WebElement KiwiSaver;

    @FindBy(xpath = "//*[@id='ubermenu-section-link-kiwisaver-ps']")
    public WebElement KiwiSaver;

    @FindBy(xpath = "//*[@id='ubermenu-item-cta-kiwisaver-calculators-ps']")
    public WebElement KiwiSaverCalculators;

    @FindBy(xpath = "//*[@href='/kiwisaver/calculators/kiwisaver-calculator/']")
    public WebElement KiwiSaverCalculatorsClick;

    @FindBy(xpath = "//a[@class='sw-sidenav-item-link link'][@href='/kiwisaver/calculators/kiwisaver-calculator/']")
    public WebElement startKiwiSaverCalculator;

    @FindBy(xpath = "//*[@label='Current age']")
    public WebElement currentAgeField;

    @FindBy(xpath = "//h1[text()='KiwiSaver Retirement Calculator']")
    public WebElement kiwiSaverCalculatorHeader;

    @FindBy(xpath = "//div[@id='side-menu-ps']//a[@href='/kiwisaver/calculators/']")
    public WebElement kiwiSaverCalculatorSideMenu;


//    @FindBy(xpath = "//i[@class='icon']/../../../div[@help-id='CurrentAge']/button[@type='button']")
//    public WebElement currentAgeHelp;

    @FindBy(xpath = "//button[@class='icon-target icon-target-help-toggle icon-btn icon-btn-info ir ng-scope']/../../div[@help-id='CurrentAge']")
    public WebElement currentAgeHelp;

//    @FindBy(xpath = "//*[@class='wpnib-field-current-age field-group ng-isolate-scope']//button/i")
//    public WebElement currentAgeHelp;

//    @FindBy(xpath = "//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i")
//    public WebElement currentAgeHelp;

    @FindBy(xpath =  "//div[@class='message-row ng-scope'][@ng-if='frameless']/div[@class='field-message message-info ng-binding']")
    public WebElement warningMessage;



}
