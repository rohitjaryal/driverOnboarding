package pageModel;

import generic.WebAction;
import or.Dashboard;
import or.WorkersPage;
import org.openqa.selenium.WebDriver;

public class WorkerPageModel {
    WebAction webAction;
    WorkersPage workersPage = new WorkersPage();
    WorkerNewPageModel workerNewPageModel;

    public WorkerPageModel(WebDriver driver, String name, String phoneNumber, String email) {
        workerNewPageModel = new WorkerNewPageModel(driver, name, phoneNumber, email);
        webAction = new WebAction(driver);
    }

    public WorkerNewPageModel selectWorker() {
        webAction.click(workersPage.getAddDriverBtn());
        return workerNewPageModel;
    }
}
