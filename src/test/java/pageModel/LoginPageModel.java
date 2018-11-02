package pageModel;

import generic.WebAction;
import or.LoginPage;
import or.Dashboard;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageModel {
    WebAction webAction;

    LoginPage loginPage = new LoginPage();
    DashboardPageModel dashboardPageModel;

    public LoginPageModel(WebDriver driver) {
        webAction = new WebAction(driver);
        dashboardPageModel = new DashboardPageModel(driver);
    }

    public DashboardPageModel login(String userName, String password) {
        try {
            webAction.type(loginPage.getLoginUsername(), userName);
            webAction.type(loginPage.getLoginPassword(), password);
            webAction.click(loginPage.getLoginBtn());
        } catch (Exception ex) {
            Assert.fail("Failed to login");
        }
        return dashboardPageModel;
    }
}
