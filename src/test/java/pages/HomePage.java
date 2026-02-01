package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {

    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_LinkText = "Sign In Portal";
    public static String onlineproduct_Link_LinkLink = "Online Products";

    public static void click_hamburger_menu() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }
public static void click_signIn_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(signIn_link_LinkText)).click();
    }

/*Test purpose*/
    public static void click_OnlineProduct_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineproduct_Link_LinkLink)).click();
    }
}
