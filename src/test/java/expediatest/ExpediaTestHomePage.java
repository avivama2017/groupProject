package expediatest;

import base.CommonAPI;
import expediahomepage.ExpediaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExpediaTestHomePage extends CommonAPI {
     ExpediaHomePage expedia;
    String url = "https://expedia.com/";

    @BeforeClass
    public void init() {expedia = PageFactory.initElements(driver, ExpediaHomePage.class);
        driver.get(url);
    }

    @AfterClass
    public void getback(){driver.get(url);}

    //@Test
    public void clickFlightButton() {

    }

    //@Test
    public void clicksetHotel() {
        expedia.setHotel();
    }

    //Test
    public void clickBunddleandsave () {
        expedia.setBunddleandsave();
    }

    //Test
    public void clickCars(){
        expedia.setCars();
    }

    //Test
    public void clickCruises(){
        expedia.setCruises();
    }

    //Test
    public void clickThingstodo(){
        expedia.setThingstodo();
    }

    //Test
    public void clickVacationRentals(){
        expedia.setVacationRentals();
    }

    //Test
    public void clickDeals(){
        expedia.setDeals();
    }

    //Test
    public void clickMobile(){
        expedia.setMobile();
    }

    //Test
    public void clickMyList(){
        expedia.setMyList();
    }

    //Test
    public void clickMyTrips(){
        expedia.setMyList();
    }

    //Test
    public void clickMySignin(){
        expedia.setSignin();
    }

    //Test
    public void clickMyAccountRegister(){
        expedia.setAccountRegister();
    }


   // @Test
    public void clickMySupportCs(){
        expedia.setSupportCs();
    }


    //Test
    public void testdropdown(){
        expedia.setTestdropdown();
    }

    @Test
    public void getTestdropdown(){
        expedia.setGetTestdropdown();
    }












}








