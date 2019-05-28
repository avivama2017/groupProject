package regression;

import base.CommonAPI;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy(id = "nav-orders")
    WebElement orderTab;

    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
    WebElement hamberger;

    @FindBy(id = "twotabsearchtextbox")
    WebElement inputSearch;

    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    WebElement Tryprime;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement Todaysdeal;

    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement Signin;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
    WebElement careers;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement Blog;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement Presscenter;

    @FindBy(xpath = "//*[@id=\"nav-logo\"]/a[1]/span[1]")
    WebElement AmazonLogo;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[7]/ul/li[8]/a")
    WebElement Help;

    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    WebElement Registry;

    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span[1]/span[1]/span[1]")
    WebElement EN;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-newCust\"]/a")
    WebElement NewCoustomer;

    @FindBy(id = "ap_customer_name")
    WebElement name;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "ap_password")
    WebElement pass;

    @FindBy(id = "ap_password_check")
    WebElement rePass;

    @FindBy(xpath = "//*[@id=\"continue\"]")
    WebElement CreateAcc;

    @FindBy(css = "#nav-xshop > a:nth-child(6)")
    WebElement WholeFoods;

    @FindBy(xpath = "//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[8]/div/label/input")
    WebElement Books;



    public void setOrderTab() {

        orderTab.click();
    }

    public void setHamberger() {
        if (hamberger.isDisplayed()) {
            hamberger.click();
            Assert.assertTrue(true);
        }
    }

    public void setInputSearch(String name) throws InterruptedException {
        if (inputSearch.isDisplayed()) {
            inputSearch.sendKeys(name, Keys.ENTER);
        }
        Thread.sleep(5000);

    }

    public void setTryPrime() {

        Tryprime.click();
    }

    public void setTodaysdeal() {
        Todaysdeal.click();
    }

    public void clickSignIn() {
        Signin.click();
    }

    public void setCareers() {
        careers.click();
    }

    public void clickOnBlog() {
        Blog.click();
    }

    public void setPressCenter() {
        Presscenter.click();
    }

    public void clickAmazonLogo() {
        if (AmazonLogo.isDisplayed()) {
            AmazonLogo.click();
            Assert.assertTrue(true);
        }
    }

    public void setHelp() {
        if (Help.isDisplayed()) {
            Help.click();
            Assert.assertTrue(true);
            sleepFor(5);
        }
    }

    public void setRegistry() {
        Registry.click();
    }

    public void VerifyDropDownBox() {
        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
        select.selectByVisibleText("Books");
        sleepFor(4);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        sleepFor(5);
    }

    public void setEN() {
        if (EN.isEnabled()) {
            EN.click();
            Assert.assertTrue(true);
        }
    }

    public void MouseMovementVerification() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).build().perform();
        NewCoustomer.click();
    }

    public void setAccCreate(String Name, String Email, String Pass, String RePass) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"))).build().perform();
        NewCoustomer.click();

        name.sendKeys(Name);
        email.sendKeys(Email);
        pass.sendKeys(Pass);
        rePass.sendKeys(RePass);
        CreateAcc.click();
        sleepFor(5);
    }

    public void getScreenShot() {
        DateFormat dateFormat = new SimpleDateFormat("mm.dd.yyyy-HH:mma");
        Date date = new Date();
        String name = dateFormat.format(date);
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("src\\main\\resources\\screenshots" + name + "new.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String navigate() {
        WholeFoods.click();
        String before = driver.getTitle();
        driver.navigate().back();
        driver.navigate().forward();sleepFor(3);
        return before;
    }

    public String getTextByXpath(String locator) {
        String st = driver.findElement(By.xpath("//*[@id=\"navSwmHoliday\"]/a/img")).getText();
        return st;
    }
    public void setBooks() {
        Todaysdeal.click();
        Books.click();
        sleepFor(4);

    }
    public List<WebElement> getListOfWebElementsByXpath() {
        List<WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        return list;
    }
    public void  ListOfWebElements(){
        List<WebElement>linkList=driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());
    }
    public List<String> getListOfString(List<WebElement> list) {
        List<String> items = new ArrayList<String>();
        for (WebElement element : list) {
            items.add(element.getText());
        }
        return items;
    }

}



