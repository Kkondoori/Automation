package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {


    public WebDriver driver;

    By signpassword=By.xpath("//button[@id='btnNonCacSignin']");






    public LandingPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }




    public WebElement getSignin()
    {
        return driver.findElement(signpassword);
    }




}