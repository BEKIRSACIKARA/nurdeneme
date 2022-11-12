package tests.US_002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PearlyMarketPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class US002_TC002 {

    PearlyMarketPage PearlyMarketPage = new PearlyMarketPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void US002_TC002() {

        //1. vendor url'ye adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("pearlyUrl"));
        //2. vendor signin butonuna tıklar
        //3. vendor gecerli bir username girer
        //4. vendor gecerli bir password girer
        //5. vendor sign in ve sing out butonuna basar
        ReusableMethods.prMrktlogInbekir();
        //6. vendor My Account butonuna basar
        PearlyMarketPage.myAccountYazisi.click();
        ReusableMethods.waitFor(3);
        String istenen = "DashboardStore ManagerOrdersDownloadsAddressesAccount detailsWishlistSupport " +
                "TicketsFollowingsLogout";
        List<WebElement> gerçek = Driver.getDriver().findElements(By.xpath("(//nav/ul)[1]//li/a"));
        for (WebElement liste:gerçek
             ) {
            System.out.println(liste.getText());
            liste.isDisplayed();
        }

      // Driver.closeDriver();


    }
}
