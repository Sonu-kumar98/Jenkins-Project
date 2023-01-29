import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PositiveScenarioTest extends  BrowserClass{

    @BeforeTest
    public void lunchBrowser(){
        launchBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void firstTestCases() throws InterruptedException {
        driver.get("https://automationtalks.com/");
        System.out.println("Get Title of page one"+driver.getTitle());;
    }
    @Test(priority = 2)
    public void secondTestCases() throws InterruptedException {
        driver.get("https://automationtalks.com/");
        System.out.println("Get Title of page two"+driver.getTitle());
    }

    @Test(priority = 3)
    public void thirdTestCases() throws InterruptedException {
        driver.get("https://automationtalks.com/");
        System.out.println("Get Title of page three"+driver.getTitle());
    }

    @AfterSuite
    public void closeBrowser() throws InterruptedException {
      driver.close();
    }

}
