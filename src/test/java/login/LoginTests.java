package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       Assert.assertEquals("You logged into a secure area!", "You logged into a secure area!");




    }
}
