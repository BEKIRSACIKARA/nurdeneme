package tests.US_001;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US001_TC007 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US001_TC007() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();
        //4. vendor email kutusuna kayıtlı bir email girer
        PearlyMarketPage.useremail.click();
        PearlyMarketPage.useremail.sendKeys(ConfigReader.getProperty("username"));
        //5. vendor password kutusuna 8 haneli kucuk harf, büyük harf, rakam ve special karakter girer
        PearlyMarketPage.userpassoword.sendKeys("Team10./");
        //6.Password kutusu altında "Strong" yazısını görebilmeli
        Assert.assertTrue(PearlyMarketPage.strongyazısı.isDisplayed());
    ReusableMethods.waitFor(1);
      Driver.closeDriver();
    }
}
