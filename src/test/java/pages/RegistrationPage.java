package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;
import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    public static String registration_text_xpath = "/html/body/center/h1";
    //public static String registration_text_xpath = "body > center > h1";

   public static void RegistrationPageName() throws InterruptedException {
     String RegistrationPgNm = driver.findElement(By.id(registration_text_xpath)).getText();
      assertEquals("User Registration Page", RegistrationPgNm);
   }

}
