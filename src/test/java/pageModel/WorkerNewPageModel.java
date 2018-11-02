package pageModel;

import generic.WebAction;
import or.Dashboard;
import or.WorkersNewPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WorkerNewPageModel {
    WebAction webAction;

    WorkersNewPage workersNewPage = new WorkersNewPage();
    String name, phoneNumber, email;

    public WorkerNewPageModel(WebDriver driver, String name, String phoneNumber, String email) {
        webAction = new WebAction(driver);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public WorkerNewPageModel addWorker(String smsTokenEnabled, String smsToken) {
        webAction.type(workersNewPage.getName(), name);
        webAction.type(workersNewPage.getPhoneNumber(), phoneNumber);
        webAction.type(workersNewPage.getEmail(), email);
        if (Boolean.valueOf(smsTokenEnabled)) {
            webAction.click(workersNewPage.getSmsTokenCheckbox());
            webAction.type(workersNewPage.getSmsToken(), smsToken);
        }
        webAction.click(workersNewPage.getSaveBtn());
        return this;
    }

    public WorkerNewPageModel verifyWorker() {
        webAction.waitForElementVisible(workersNewPage.getPhoneNumberForVerification(phoneNumber), 3);
        Assert.assertEquals(webAction.getText(workersNewPage.getTitleForVerification()), name.toUpperCase());
        Assert.assertEquals(webAction.getText(workersNewPage.getPhoneNumberForVerification(phoneNumber)), phoneNumber);
        Assert.assertEquals(webAction.getText(workersNewPage.getEmailForVerification(email)), email);
        return this;
    }
}
