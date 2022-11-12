package tests.US_001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_TC002 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();

    @Test
    public void US001_TC002() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();


        PearlyMarketPage.useremail.click();
        Assert.assertTrue(PearlyMarketPage.useremail.isDisplayed());
        ReusableMethods.waitFor(1);

        PearlyMarketPage.userpassoword.click();
        Assert.assertTrue(PearlyMarketPage.userpassoword.isDisplayed());
        ReusableMethods.waitFor(1);

        PearlyMarketPage.userpassoword.click();
        Assert.assertTrue(PearlyMarketPage.userpassoword.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }
}
