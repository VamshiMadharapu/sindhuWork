package stepdefs;

import com.gargoylesoftware.htmlunit.WebWindow;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.PropertiesReader;
import pages.KiwiSaverPage;
import org.junit.Assert;
import util.SpinLoadChangesTo;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {

	private String URL;
	public static WebDriver driver;

	ChromeOptions options = new ChromeOptions();

	public static void closeBrowser() {
		driver.quit();
	}

	@Before (value = "@Web")
	public void iReadThePropertiesFile() {
		PropertiesReader.load(System.getProperty("user.dir") + "/src/test/resources/data.properties");
		URL = PropertiesReader.get("url");
		System.out.println("Westpac URL read from data.properties file");
	}

	@Given("^The website URL for Kiwisaver Retirement Calculator$")
	public void the_website_url_for_kiwisaver_retirement_calculator() {
		WebDriverManager.chromedriver().browserVersion("86").setup();
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("disable-infobars");
		options.addArguments("--whitelisted-ips");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-browser-side-navigation");
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("url is: " + URL);
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("** Browser Initiated **");
	}

	@When("^User navigates to the Kiwisaver Calculators$")
	public void user_navigates_to_the_kiwisaver_calculators() throws InterruptedException {
		KiwiSaverPage kSaverPage = new KiwiSaverPage(driver);
		kSaverPage.KiwiSaver.click();
//		Actions actions = new Actions(driver);
//		actions.moveToElement(kSaverPage.KiwiSaver).clickAndHold(kSaverPage.KiwiSaver).click(kSaverPage.KiwiSaverCalculators).build();
//		actions.moveToElement(kSaverPage.KiwiSaver).contextClick();
//		actions.moveToElement(kSaverPage.KiwiSaverCalculators).click();
//		kSaverPage.KiwiSaverCalculatorsClick.click();
//		actions.click().build().perform();
//		kSaverPage.KiwiSaverCalculators.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(kSaverPage.kiwiSaverCalculatorSideMenu)).isDisplayed();
		kSaverPage.kiwiSaverCalculatorSideMenu.click();
	}

	@And("^User clicks on Kiwisaver Start button$")
	public void user_clicks_on_kiwisaver_start_button() throws Throwable {
		KiwiSaverPage kSaverPage = new KiwiSaverPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(kSaverPage.startKiwiSaverCalculator)).click();
		wait.until(ExpectedConditions.visibilityOf(kSaverPage.kiwiSaverCalculatorHeader)).isDisplayed();

	}

	@Then("^User is displayed with Information icon \"([^\"]*)\"$")
	public void user_is_displayed_with_information_icon_something(String message) throws Throwable {
		KiwiSaverPage kSaverPage = new KiwiSaverPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(kSaverPage.currentAgeField)).isDisplayed();
		wait.until(ExpectedConditions.elementToBeClickable(kSaverPage.currentAgeHelp)).click();
//		kSaverPage.currentAgeHelp.click();
		Assert.assertEquals(message, kSaverPage.warningMessage.getText());

	}


	@After(value = "@Web")
	public static void quitBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (Exception e) {
				System.out.println("Exception while taking screenshot " + e.getMessage());
			}
		}
		closeBrowser();
	}
}
