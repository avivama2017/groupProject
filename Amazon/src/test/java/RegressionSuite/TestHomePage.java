package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.AfterMethod;

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
    @Test
    public void clickOnOrder() {
        homePage.setOrderTab();

    }

    @Test
    public void clickOnHamberger() {
        homePage.setHamberger();
    }

    @Test
    public void serchItems() throws InterruptedException {
        homePage.setinputSerch("iPhone");

    }

    @Test
    public void clickOnTryprime() {
        homePage.setTryprime();
    }

    @Test
    public void clickOnTodays() {
        homePage.setTodaysdeal();
    }

    @Test
    public void clickOnSignin() {
        homePage.clickSignin();
    }

    @Test
    public void clickOncarrers() {
        homePage.setCareers();
    }

    @Test
    public void clickOnBlog() {
        homePage.clickOnBlog();
    }

    @Test
    public void clickOnPreesCenter() {
        homePage.setPresscenter();
    }

    @Test
    public void clickAmazonLogo() {
        homePage.clickAamzonLogo();
    }

    @Test
    public void clickFindaGift() {
        homePage.setHelp();
    }

    @Test
    public void clickOntRegistry() {
        homePage.setRegistry();
    }

    @Test
    public void signInValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("mdulla1984@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("//*[momin0298");
        driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
    }

    @Test
    public void CartValidation() {
        driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[2]")).click();
    }

    @Test
    public void sellOnAmazonTest() {
        driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")).click();
    }
}





