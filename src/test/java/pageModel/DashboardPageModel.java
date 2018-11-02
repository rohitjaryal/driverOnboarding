package pageModel;

import generic.WebAction;
import or.Dashboard;
import or.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DashboardPageModel {
    WebAction webAction;

    Dashboard dashboard = new Dashboard();

    public DashboardPageModel(WebDriver driver) {
        webAction = new WebAction(driver);
    }

    public DashboardPageModel selectWorker() {
        webAction.waitForElementVisible(dashboard.getLeftNavigationBar(),3);
        webAction.hoverOverElement(dashboard.getLeftNavigationBar());
        webAction.waitForElementVisible(dashboard.getNavigationBarMenu("Workers"),3);
        webAction.click(dashboard.getNavigationBarMenu("Workers"));
        return this;
    }
}
