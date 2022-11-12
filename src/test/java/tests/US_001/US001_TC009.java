package tests.US_001;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_TC009 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US001_TC009() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();
        //4. vendor email kutusuna kayıtlı bir email girer
        PearlyMarketPage.useremail.click();
        PearlyMarketPage.useremail.sendKeys(ConfigReader.getProperty("username"));
        // 5."RE-SEND CODE" kutucuğuna tıklayabilmeli
       PearlyMarketPage.resendcodebutton.click();

        // 6.Kayıt olunan E-maile onay kodu gönderildiğini görebilmeli ve onaylayabilmeli
        Driver.getDriver().get("https://mail.google.com/mail/u/4/#inbox");

        PearlyMarketPage.gmailgiris.sendKeys(ConfigReader.getProperty("username"));
        PearlyMarketPage.sonrakiButton.click();
        ReusableMethods.waitFor(3);
       PearlyMarketPage.gmailsifre.sendKeys("techpro81");
       ReusableMethods.waitFor(3);
        PearlyMarketPage.sonrakiButton2.click();
        ReusableMethods.waitFor(3);
      Assert.assertTrue(PearlyMarketPage.emailonaykodudogrulama.isDisplayed());
    }
}
