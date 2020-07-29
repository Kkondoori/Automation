package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.PasswordAuthentication;

public class LoginPage {
    public WebDriver driver;

    By cac=By.xpath("//button[@id='btnNonCacSignin']");
    By email=By.xpath("//input[@placeholder='Email']");
    By password=By.xpath("//input[@placeholder='Password']");
    By loginbutton = By.xpath("//button[@id='btnSignin']");




    public LoginPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }



    public WebElement getSign()
    {
        return driver.findElement(cac);
    }
    public WebElement getemail()
    {
        return driver.findElement(email);
    }

        public WebElement getPassword() {
            return driver.findElement(password);
        }

        public WebElement getLoginbutton()
        {
            return  driver.findElement(loginbutton);
            }



    }







