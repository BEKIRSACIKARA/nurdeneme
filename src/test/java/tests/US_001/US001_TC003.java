package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US001_TC003 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US001_TC003() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();
        //4. vendor email kutusu boş bırakır
        PearlyMarketPage.useremail.click();
        //5. vendor geçerli password girer
        PearlyMarketPage.userpassoword.sendKeys(ConfigReader.getProperty("password"));
        //6. vendor confirm password'e geçerli password girer
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();
        ReusableMethods.waitFor(1);
        //7. vendor register butonunu tıklar
        actions.sendKeys(Keys.TAB).click().perform();

       //8. vendor register yapılamadığını görebilmeli
        Assert.assertTrue(PearlyMarketPage.registeremailyapilmadihatasi.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
