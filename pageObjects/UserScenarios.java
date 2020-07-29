package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserScenarios {
    public WebDriver driver;

    By cac_user=By.xpath("//button[@id='btnNonCacSignin']");
    By email_user=By.xpath("//input[@placeholder='Email']");
    By password_user=By.xpath("//input[@placeholder='Password']");
    By loginbutton_user = By.xpath("//button[@id='btnSignin']");
    By project_link_user =By.cssSelector("#MyProjects-link");
    By approval_link_user=By.cssSelector("#ApprovalInbox-link");
    By user_link = By.linkText("User");
    By project_link= By.linkText("Project");
    By budget_link =By.linkText("Budgeting");
    By report_link =By.linkText("Reports");
    By user_listing =By.xpath("//a[@class='nav-link dropdown-toggle'][contains(text(),'User')]");
    By listing =By.xpath ("/html[1]/body[1]/div[1]/app[1]/header[1]/nav[1]/div[1]/ul[1]/li[1]/div[1]/a[1]");
    By Title = By.xpath("//h1[@class='MainTitle']");
    By firstname= By.xpath("//input[@name='FirstName']");
    By lastname = By.xpath("//input[@name='LastName']");
    By emailaddress = By.xpath("//input[@name='Email']");
    By status= By.xpath("//select[@name='Status']");
    By roleid = By.xpath("//select[@name='RoleId']");
    By rdmsc = By.xpath("//div[@class='row']//div[2]//div[1]//div[1]//select[1]");
    By search =By.xpath ("//button[contains(text(),'Search')]");


    public UserScenarios(WebDriver driver) {
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

    public WebElement getPassword() {
        return driver.findElement(password_user);
    }

    public WebElement getLoginbutton()
    {
        return  driver.findElement(loginbutton_user);
    }

   public WebElement getProectlink(){ return driver.findElement(project_link_user);}

   public WebElement getApprovalLink(){ return driver.findElement(approval_link_user);}
   public WebElement getuser(){ return driver.findElement(user_link);}
   public WebElement getProject(){ return driver.findElement(project_link);}
   public WebElement getbugget() { return driver.findElement(budget_link);}
   public WebElement geteports(){return driver.findElement(report_link);}
   public WebElement getuserlisting(){ return driver.findElement(user_listing);}
    public WebElement getlisting(){ return driver.findElement(listing);}
    public WebElement gettitle(){return driver.findElement(Title);}


    public WebElement getfirstname(){return driver.findElement(firstname);}
    public WebElement getlastname(){return driver.findElement(lastname);}
    public WebElement getemailaddress() {return driver.findElement(emailaddress);}
    public WebElement getstatus(){return driver.findElement(status);}
    public WebElement getroleid(){return driver.findElement(roleid);}
    public WebElement getrdmsc(){ return driver.findElement(rdmsc);}
    public WebElement getsearch(){return driver.findElement(search);}







}

