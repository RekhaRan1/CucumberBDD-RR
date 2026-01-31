package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BrowserDriver;


public class LoginPage extends BrowserDriver {

    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn = "//*[@id=\"second_form\"]/input";
    public static String Registration_btn_id = "NewRegistration";

    public static void username() throws InterruptedException {
        driver.findElement(By.id("usr")).sendKeys("rekha.chauhan22@gmail.com");
    }
    public static void password() throws InterruptedException {
        driver.findElement(By.id("pwd")).sendKeys("Atharv@21");
    }
    public static void click_login_btn() throws InterruptedException {
        driver.findElement(By.xpath(login_btn)).click();
    }
    public static void click_Registration_btn() throws InterruptedException {
        driver.findElement(By.id(Registration_btn_id)).click();
    }
}
