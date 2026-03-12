package tests;

import api.UserAPI;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import pages.DashboardPage;

public class LoginHybridTest extends BaseTest {

    @Test
    public void createUserAndLoginTest() throws InterruptedException {

        driver.get(ConfigReader.getProperty("baseUrl"));

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();
        Thread.sleep(2000);

        System.out.println("Current URL: " + driver.getCurrentUrl());

        DashboardPage dashboardPage = new DashboardPage(driver);

        Assert.assertTrue(dashboardPage.isSecurePage());
    }

}