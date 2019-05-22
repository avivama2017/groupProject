package regression;

import base.CommonAPI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(id = "nav-orders")
    WebElement orderTab;
    @FindBy(xpath = "//*[@id=\"nav-hamburger-menu\"]/i")
    WebElement hamberger;
    @FindBy(id = "twotabsearchtextbox")
    WebElement inputSearch;
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]/span[2]")
    WebElement Tryprime;
    @FindBy(id = "nav-your-amazon")
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

    public void setOrderTab() {
        orderTab.click();
    }

    public void setHamberger() {
        if (hamberger.isDisplayed()) {
            hamberger.click();
            Assert.assertTrue(true);
        }
    }

    public void setinputSerch(String name) throws InterruptedException {
        if (inputSearch.isDisplayed()) {
            inputSearch.sendKeys(name, Keys.ENTER);
        }
        Thread.sleep(5000);

    }

    public void setTryprime() {
        Tryprime.click();
    }

    public void setTodaysdeal() {
        Todaysdeal.click();
    }

    public void clickSignin() {
        Signin.click();
    }

    public void setCareers() {
        careers.click();
    }

    public void clickOnBlog() {
        Blog.click();
    }

    public void setPresscenter() {
        Presscenter.click();
    }

    public void clickAamzonLogo() {
        if (AmazonLogo.isDisplayed()) {
            AmazonLogo.click();
            Assert.assertTrue(true);
        }
    }

    public void setHelp() {
        Help.click();
    }

    public void setRegistry() {
        Registry.click();
    }
}





