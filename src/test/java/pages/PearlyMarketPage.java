package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PearlyMarketPage {


    public PearlyMarketPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='register inline-type']")
    public WebElement  register;

    @FindBy(xpath = "//*[text()='Become a Vendor']")
    public WebElement  becomeavendor;

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement signIn2;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccountYazisi;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy(xpath = "(//*[@class='login logout inline-type'])[1]")
    public WebElement signOut;

    @FindBy(xpath = "//*[@id='user_email']")
    public WebElement useremail;
    @FindBy(xpath = " //*[@id='passoword']")
    public WebElement userpassoword;
    @FindBy(xpath = " //*[@id='confirm_pwd']")
    public WebElement userconfirm_pwd;

    @FindBy(xpath = "//*[@id='wcfm_membership_register_button']")
    public WebElement register_button;
    @FindBy(xpath = "//*[text()='Email: This field is required.']")
    public WebElement registeremailyapilmadihatasi;
    @FindBy(xpath = "//*[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement registeryapildi;
    @FindBy(xpath = "//*[text()='Please provide a valid email address.']")
    public WebElement gecersizemailhatasiyazisi;
    @FindBy(xpath = "//*[@class='wcfm-text wcfm_email_verified_input']")
    public WebElement dogrulamakodu;

    @FindBy(xpath = "//*[text()='This Email already exists. Please login to the site and apply as vendor.']")
    public WebElement aynıemailregistergirilemedi;

    @FindBy(xpath = "//*[@id='password_strength']")
    public WebElement strongyazısı;

    @FindBy(xpath = "//*[@class='wcfm-text wcfm_submit_button wcfm_email_verified_button']")
    public WebElement resendcodebutton;

    @FindBy(xpath = "//*[@id='identifierId']")
    public WebElement gmailgiris;

    @FindBy(xpath = "(//*[@class='VfPpkd-vQzf8d'])[2]")
    public WebElement sonrakiButton;

    @FindBy(xpath = "//*[@name='Passwd']")
    public WebElement gmailsifre;
    @FindBy(xpath = "(//*[@class='VfPpkd-vQzf8d'])[2]")
    public WebElement sonrakiButton2;

    @FindBy(xpath = "//*[text()='Doğrulama kodunu kısa mesajla almak için telefon numarası girin.']")
    public WebElement emailonaykodudogrulama;

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signinbutton;
    @FindBy(xpath = "//*[@id='username']")
    public WebElement signinusername;

    @FindBy(xpath = "//*[@id='password']")
    public WebElement signinuserparola;
    @FindBy(xpath = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement signinButton2;

    @FindBy(xpath = "(//*[text()='My Account'])[2]")
    public WebElement MyAccountYazisi;
    @FindBy(xpath = "(//*[@href='https://pearlymarket.com/my-account-2/'])[1]")
    public WebElement myAccount;
    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "(//nav/ul)[1]")
    public WebElement MyAccountnavigation;




}
