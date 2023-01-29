import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserClass {
    public WebDriver driver;

    public void launchBrowser(String browserName)
    {
         System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
     //   System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
//        System.setProperty("webdriver.edge.driver","C:\\Users\\Ayushi\\eclipse-workspace\\msedgedriver.exe");
//        System.setProperty("webdriver.ie.driver","C:\\Program Files\\Eclipse\\drivers\\IEDriverServer.exe");
        if(browserName.equalsIgnoreCase("chrome"))
        {

            this.driver = new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("Firefox"))
        {
            FirefoxOptions fops = new FirefoxOptions();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("dom.webnotifications.enabled", false);
            profile.setAcceptUntrustedCertificates(true);
            profile.setAssumeUntrustedCertificateIssuer(false);
            fops.setProfile(profile);//links profile to the options
            driver= new FirefoxDriver(fops);
        }
        else if(browserName.equalsIgnoreCase("Edge"))
        {
            EdgeOptions option = new EdgeOptions();
            driver= new EdgeDriver();
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","C:\\Program Files\\Eclipse\\drivers\\IEDriverServer.exe");
            InternetExplorerOptions options=new InternetExplorerOptions();
            driver= new InternetExplorerDriver(options);
        }
        driver.manage().window().maximize();
    }
}
