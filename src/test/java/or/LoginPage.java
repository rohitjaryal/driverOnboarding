package or;

import org.openqa.selenium.By;

public class LoginPage {
    public By getLoginUsername() {
        return By.name("email");
    }

    public By getLoginPassword() {
        return By.name("password");
    }

    public By getLoginBtn() {
        return By.xpath("//button[text()='Sign in']");
    }
}
