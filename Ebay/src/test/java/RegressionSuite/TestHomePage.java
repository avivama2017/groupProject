package RegressionSuite;

import Regression.HomePage;
import base.CommonAPI;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {

    HomePage homePage;
    String url = "https://www.ebay.com/" ;


    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(url);
    }

    @AfterMethod
    public void recap() {
        driver.get(url);
    }

    @Test(priority = 1,enabled = false)
    public void ebayLogoVerificationTest()  {
        homePage.ebayLogoVerification();
    }

    @Test(priority = 2,enabled = false)
    public void SearchProduct(){
        homePage.SearchForItem();
    }
    @Test
    public void AddItemToCart(){
        homePage.AddToCart();
    }

    //@Test
    public void SignInWithValidCredentials(){
        homePage.EnterValidUserName("","");
    }

   // @Test
    public void SignOutVerification() throws InterruptedException {
        homePage.SignOutVerification();
    }

    //@Test
    public void RegistrationFieldValidation(){
        homePage.CheckRegistrationField();
    }

   // @Test
    public void MouseMovementVerification() throws InterruptedException {
        homePage.mouseOverVerification();
    }

   // @Test
    public void getScreenShot(){
        homePage.TakeScreenshot();
    }


}
