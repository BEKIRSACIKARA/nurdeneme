package tests.US_002;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002_TC001 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US002_TC001() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        //2. vendor signin butonuna tıklar
        //3. vendor gecerli bir username girer
        //4. vendor gecerli bir password girer
        //5. vendor sign in ve sing out butonuna basar
        ReusableMethods.prMrktlogInbekir();
        //6. vendor My Account'u gorur
        Assert.assertTrue(PearlyMarketPage.myAccountYazisi.isDisplayed());
        ReusableMethods.waitFor(3);
        Driver.closeDriver();

    }
}
