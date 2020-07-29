package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InviteUser {
    public WebDriver driver;


    //By cac_user=By.xpath("//button[@id='btnNonCacSignin']");
    //By email_user=By.xpath("//input[@placeholder='Email']");

   By User =By.xpath("//a[@class='nav-link dropdown-toggle'][contains(text(),'User')]");
   By Dropdown =By.xpath("/html[1]/body[1]/div[1]/app[1]/header[1]/nav[1]/div[1]/ul[1]/li[1]/div[1]/a[2]");
   By Useremail= By.xpath("//input[@id='email']");
   By FirstName=By.xpath("//input[@id=''firstName']");
   By LastName=By.xpath("//input[@id='lastName']");
   By AddRole= By.xpath("//tab[contains(@class,'active tab-pane')]//input[contains(@class,'mb-2 ml-3')]");
   By WebAdministrator =By.xpath("/html[1]/body[1]/div[1]/app[1]/div[1]/div[1]/user-edit[1]/div[1]/form[1]/div[2]/section[1]/tabset[1]/div[1]/tab[1]/div[1]/input[1]");
   By Assign = By.xpath("//div[@id='addRolePropertyModal']//button[@class='btn btn-primary btn-sm'][contains(text(),'Assign')]");
   By Hierarchydata = (By.xpath("//span[contains(text(),'Hierarchy Data')]"));
   By AddHierarchdata = (By.xpath("//tab[contains(@class,'tab-pane active')]//input[contains(@class,'mb-2 ml-3')]"));


   public InviteUser(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }

    public WebElement getSign()
    {
        return driver.findElement(cac_user);
    }
    public WebElement getemail()
    {
        return driver.findElement(email_user);
    }