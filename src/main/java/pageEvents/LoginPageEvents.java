package pageEvents;

import org.testng.Assert;
import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
    public void verifyLogInPageOpenOrNot(){
        ElementFetch elementFetch = new ElementFetch();
        Assert.assertTrue(elementFetch.getListWebElements("XPATH", LoginPageElements.loginTest).size() > 0, "Login page did not open");
    }
    public void enterEmail(){
        ElementFetch elementFetch = new ElementFetch();
        elementFetch.getWebElement("ID", LoginPageElements.emailAddress).sendKeys("sapna@gmail.com");

    }
}
