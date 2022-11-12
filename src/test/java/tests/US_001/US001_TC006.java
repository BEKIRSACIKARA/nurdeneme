package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_TC006 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US001_TC006() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();
        //4. vendor email kutusuna kayıtlı bir email girer
        PearlyMarketPage.useremail.click();
        PearlyMarketPage.useremail.sendKeys(ConfigReader.getProperty("username"));
        //5. vendor geçerli password girer
        PearlyMarketPage.userpassoword.sendKeys(ConfigReader.getProperty("password"));
        //6. vendor confirm password'e geçerli password girer
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.waitFor(1);
        //7. dorulama kodunu girer girer
        PearlyMarketPage.dogrulamakodu.sendKeys("123456");
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        //8. vendor register butonunu tıklar
        //actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().perform();
        PearlyMarketPage.register_button.click();
        ReusableMethods.waitFor(5);
        //9. vendor aynı mail ile register yapılamadığını görebilmeli
        Assert.assertTrue(PearlyMarketPage.aynıemailregistergirilemedi.isDisplayed());
        ReusableMethods.waitFor(1);
        Driver.closeDriver();
    }
}
