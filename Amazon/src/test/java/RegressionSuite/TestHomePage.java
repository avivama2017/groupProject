package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterMethod;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    String url = "https://www.amazon.com/";

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    //@AfterMethod
    // public void reCap() {
    //driver.close();
    //}
    @Test(priority = 1, enabled = false)
    public void clickOnOrder() {
        homePage.setOrderTab();

    }

    @Test(priority = 2, enabled = false)
    public void clickOnHamberger() {
        homePage.setHamberger();
    }

    @Test(priority = 3, enabled = false)
    public void searchItems() throws InterruptedException {
        homePage.setInputSearch("iPhone");

    }

    @Test(priority = 4, enabled = false)
    public void clickOnTryPrime() {
        homePage.setTryPrime();
    }

    @Test(priority = 5, enabled = false)
    public void clickOnTodays() {
        homePage.setTodaysdeal();
    }

    @Test(priority = 6, enabled = false)
    public void clickOnSignIn() {
        homePage.clickSignIn();
    }

    @Test(priority = 7, enabled = false)
    public void clickOncarrers() {
        homePage.setCareers();
    }

    @Test(priority = 8, enabled = false)
    public void clickOnBlog() {
        homePage.clickOnBlog();
    }

    @Test(priority = 9, enabled = false)
    public void clickOnPressCenter() {
        homePage.setPressCenter();
    }

    @Test(priority = 10, enabled = false)
    public void clickAmazonLogoTest() {
        homePage.clickAmazonLogo();
    }

    @Test(priority = 11, enabled = false)
    public void clickHelp() {
        homePage.setHelp();
    }

    @Test(priority = 12, enabled = false)
    public void clickOntRegistry() {
        homePage.setRegistry();
    }

    @Test(priority = 13, enabled = false)
    public void signInValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mdulla1984@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("//*[momin0298");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    @Test(priority = 14, enabled = false)
    public void CartValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
    }

    @Test(priority = 15, enabled = false)
    public void sellOnAmazonTest() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")).click();
    }

    @Test(priority = 16, enabled = false)
    public void AmazonAssistant() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[7]/a")).click();

    }

    @Test(priority = 17, enabled = false)
    public void accountVarify() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[1]/a")).click();
    }

    @Test(priority = 18, enabled = false)
    public void AmazonbusinessCardTest() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[5]/ul/li[3]/a")).click();
    }

    @Test(priority = 19, enabled = false)
    public void PrepaidCardTest() {
        driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[6]/span")).submit();
    }

   // @Test
    public void DropDownBoxValidation() {
        homePage.VerifyDropDownBox();
    }

   // @Test
    public void ClickOnEN() {
        homePage.setEN();
    }

    //@Test
    public void createAccount() {

        homePage.setAccCreate("md", "barackobama90@yahoo.com", "abcd1234", "abcd1234");
        sleepFor(5);
    }

    // @Test
    public void MouseMovementTest() {
        homePage.MouseMovementVerification();
        sleepFor(3);
    }

    //@Test
    public void TakeScreenShot() {
        homePage.getScreenShot();
    }

    //@Test
    public void checkNevigation() {
        Assert.assertEquals(homePage.navigate(), "Whole Foods Market @ Amazon.com");
        System.out.println("Navigate is working");
    }

    //@Test
    public void getTextFromWebPage() {
        homePage.getTextByXpath("Shop Deals of the Day");
    }

     //@Test
    public void clickOnBooks() {
        homePage.setBooks();
    }
    //@Test
    public void ListOFWebElements(){
        homePage.getListOfWebElementsByXpath();
    }
    @Test
    public void ListOfTotalWebElement(){
        homePage.ListOfWebElements();
    }

}






