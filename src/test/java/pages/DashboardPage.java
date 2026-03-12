package pages;

import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean isSecurePage(){
        return driver.getCurrentUrl().contains("secure");
    }

    public boolean isLoginSuccessful(){

        return driver.getPageSource().contains("You logged into a secure area!");

    }
}