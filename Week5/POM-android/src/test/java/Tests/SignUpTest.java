package Tests;

import Pages.SignUpPage;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test(priority = 0)
    public void wrongUsername() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.wrongSignUpWithCredentials("user.deneme.user123@gmail.com", "%&userdeneme123qwe",
                "%&userdeneme123qwe");
    }

    @Test(priority = 1)
    public void successUsername() {
        //her calistirmada, email ve username degismeli. Uye olduktan sonra ayni email ve username kullanilamiyor.
        //username max.20 karakterli olmali.
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.successSignUpWithCredentials("user.deneme.user38@gmail.com", "userdenemeuser38",
                        "%&userdeneme123qwe")
                .checkMsg("Hi");
    }
}
