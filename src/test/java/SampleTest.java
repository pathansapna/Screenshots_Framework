import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.BaseTest;

public class SampleTest extends BaseTest {

    @Test
    public void samplMethodForEmailEntering(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignInButton();

        LoginPageEvents loginPageEvents = new LoginPageEvents();
        loginPageEvents.verifyLogInPageOpenOrNot();
        loginPageEvents.enterEmail();
    }

}
