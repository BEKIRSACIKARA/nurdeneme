package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_TC005 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US001_TC005() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();
        //4. vendor email kutusuna içinde @ işareti olmayan bir email girer
        PearlyMarketPage.useremail.click();
        PearlyMarketPage.useremail.sendKeys("team10.batch81gmail.com");
        //5. vendor geçerli password girer
        PearlyMarketPage.userpassoword.click();
        PearlyMarketPage.userpassoword.sendKeys("testng1081");
        //6. vendor confirm password'e geçerli password girer
        actions.sendKeys(Keys.TAB).sendKeys("testng1081").sendKeys(Keys.TAB).click().perform();
        ReusableMethods.waitFor(2);

        // 7. vendor register butonunu tıklar
        PearlyMarketPage.register_button.click();

        //8. vendor register yapılamadığını görebilmeli
        Assert.assertTrue(PearlyMarketPage.registeremailyapilmadihatasi.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }
}
