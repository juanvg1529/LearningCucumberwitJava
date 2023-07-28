package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginFeature {
    private WebDriver driver;

    @Given("The user logs at the page of ParaBank Application")
    public void the_user_logs_at_the_page_of_para_bank_application() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    @When("the user enter valid credential")
    public void the_user_enter_valid_credential() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.name("username")).sendKeys("tautester");
        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.name("username")).submit();

    }

    @Then("The user can be taken tod the Overview page")
    public void the_user_can_be_taken_tod_the_overview_page() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(By.xpath(\"//*[@id=\\\"rightPanel\\\"]/p\")"))));
        System.out.println( driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText());
        driver.quit();
    }
}
