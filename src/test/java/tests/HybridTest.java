package tests;

import api.UserAPI;
import base.BaseTest;
import org.testng.annotations.Test;

public class HybridTest extends BaseTest {

    @Test
    public void createUserAndOpenSiteTest() {

        int userId = UserAPI.createUser();

        System.out.println("Created User ID: " + userId);

        driver.get("https://example.com");

    }

}