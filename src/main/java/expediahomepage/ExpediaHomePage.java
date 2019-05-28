package expediahomepage;


import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ExpediaHomePage extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"tab-flight-tab-hp\"]/span[2]")
    WebElement flightButton;


    @FindBy(xpath = "//*[@id=\"tab-hotel-tab-hp\"]/span[2]")
    WebElement Hotel;


    @FindBy(xpath = "//*[@id=\"tab-package-tab-hp\"]/span[2]")
    WebElement Bunddleandsave;


    @FindBy(xpath = "//*[@id=\"tab-car-tab-hp\"]/span[1]")
    WebElement Cars;


    @FindBy(xpath = "//*[@id=\"tab-cruise-tab-hp\"]/span[2]")
    WebElement Cruises;


    @FindBy(xpath = "//*[@id=\"tab-activity-tab-hp\"]/span[2]")
    WebElement Thingstodo;


    @FindBy(xpath = "//*[@id=\"tab-vacation-rental-tab-hp\"]/span[2]")
    WebElement VacationRentals;


    @FindBy(xpath = "//*[@id=\"primary-header-deals\"]")
    WebElement Deals;



    @FindBy(xpath = "//*[@id=\"primary-header-mobile\"]")
    WebElement Mobile;


    @FindBy(xpath = "//*[@id=\"header-history\"]/span[1]")
    WebElement MyList;


    @FindBy(xpath = "//*[@id=\"header-itineraries\"]")
    WebElement MyTrips;


    @FindBy(xpath = "//*[@id=\"account-signin\"]")
    WebElement Signin;


    @FindBy(xpath = "//*[@id=\"account-register\"]")
    WebElement AccountRegister;


    @FindBy(xpath = "//*[@id=\"support-cs\"]")
    WebElement SupportCs;



    @FindBy(xpath = "//*[@id=\"package-advanced-preferred-class-hp-package\"]")
    WebElement testdropdown;

    public void setTestdropdown(){
        Select select = new Select(testdropdown);
        select.selectByIndex(2);
        sleepFor(6);
    }

    @FindBy(xpath = "//*[@id=\"package-advanced-preferred-class-hp-package\"]")
    WebElement getTestdropdown;

    public void setGetTestdropdown(){
        Select select = new Select(getTestdropdown);
        select.selectByIndex(3);
        sleepFor(8);
    }
    





    public void setSupportCs(){flightButton.click();}



    public void setAccountRegister(){flightButton.click();}


    public void setSignin(){flightButton.click();}



    public void setMyTrips(){flightButton.click();}


    public void setMyList(){flightButton.click();}


    public void setMobile(){flightButton.click();}


    public void setDeals(){flightButton.click();}


    public void setVacationRentals(){flightButton.click();}


    public void setThingstodo(){flightButton.click();}


    public void setCruises(){flightButton.click();}


    public void setCars(){flightButton.click();}


    public void setBunddleandsave(){flightButton.click();}


    public void setHotel(){flightButton.click();

    }

    public void setFlightButton(){flightButton.click();}



}

