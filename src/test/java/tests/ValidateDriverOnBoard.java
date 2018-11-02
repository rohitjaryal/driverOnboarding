package tests;

import generic.BaseSetup;
import or.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageModel.DashboardPageModel;
import pageModel.LoginPageModel;
import pageModel.WorkerNewPageModel;
import pageModel.WorkerPageModel;

public class ValidateDriverOnBoard extends BaseSetup {

    /***
     *
     * @param userName
     * @param password
     * @param name - Driver name to be added.
     * @param phoneNumber - Phone number of driver. Only new numbers are accepted.
     * @param email
     * @param isSmsTokenEnabled - Enable/Disable sms token while Onboarding. The value can be TRUE|FALSE
     * @param smsToken - SMS token used during Onboarding
     */

    @Parameters({"userName", "password","name","phoneNumber","email","isSmsTokenEnabled","smsToken"})
    @Test
    public void validateDriverOnBoarding(String userName, String password, String name, String phoneNumber, String email, String isSmsTokenEnabled, String smsToken) {
        LoginPageModel loginPageModel = new LoginPageModel(driver);
        loginPageModel.login(userName, password).selectWorker();
        WorkerPageModel workerPageModel = new WorkerPageModel(driver, name, phoneNumber, email);
        workerPageModel.selectWorker().addWorker(isSmsTokenEnabled, smsToken).verifyWorker();
    }
}
