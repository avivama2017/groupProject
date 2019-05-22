package Regression;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH,using="//img[@id='gh-logo']")
    WebElement ebayLogo;

    @FindBy(how = How.XPATH,using = "//*[@type='submit']")
    WebElement Submit_Button;

    @FindBy(how = How.XPATH,using = "//*[@type='text']")
    WebElement SearchItem;

    @FindBy(how = How.XPATH,using = "//a[text()='Sign in']")
    WebElement SignInButton;

    @FindBy(how = How.NAME,using = "userid")
    WebElement username;

    @FindBy(how = How.NAME, using = "pass")
    WebElement Password;

    @FindBy(how = How.ID, using = "sgnBt")
    WebElement SignIn;


    public void ebayLogoVerification() {
        if (ebayLogo.isDisplayed()) {
            Assert.assertTrue(true);
        }
    }

    public void SearchForItem() {
        SearchItem.sendKeys("tv");
        Submit_Button.click();
    }

    public void AddToCart() {

        SearchItem.sendKeys("tv");
        Submit_Button.click();
        driver.findElement(By.className("s-item__title")).click();
        driver.findElement(By.id("isCartBtn_btn")).click();
        driver.findElement(By.xpath("//button[text()='No thanks']")).click();
    }

    public void EnterValidUserName(String uid, String pass) {
        SignInButton.click();
        username.sendKeys("ssanyalashok");
        Password.sendKeys("suprokash8071");
        SignIn.click();
    }

    public void SignOutVerification() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("userid")).sendKeys("ssanyalashok");
        driver.findElement(By.name("pass")).sendKeys("suprokash8071");
        driver.findElement(By.id("sgnBt")).click();
        driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[2]")).click();
        driver.findElement(By.xpath("//a[text()='Sign out']")).click();

    }

    public void CheckRegistrationField(){
        driver.findElement(By.xpath("//*[@id=\"gh-ug-flex\"]/a")).click();
        driver.findElement(By.name("firstname")).sendKeys("L");
        driver.findElement(By.name("lastname")).sendKeys("Robison");
        driver.findElement(By.name("email")).sendKeys("lrobinson@gmail.com");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("lrobinson1984");
        driver.findElement(By.xpath("//*[@id=\"ppaFormSbtBtn\"]")).click();
    }

    public void mouseOverVerification() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
        driver.findElement(By.linkText("Electronics")).click();
    }

    public void TakeScreenshot(){

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File ("src\\test\\resources\\ScreenShot\\ebay.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}