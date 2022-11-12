package tests.US_001;

import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US001_TC001 {

     PearlyMarketPage PearlyMarketPage=new PearlyMarketPage();

    @Test
    public void US001_TC001() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));

        //2. vendor register butonuna tıklayabilmeli
        PearlyMarketPage.register.click();

        //3. vendor açılan ekranda become a vendor'a tıklayabilmeli
        PearlyMarketPage.becomeavendor.click();

        Driver.closeDriver();

    }
}
