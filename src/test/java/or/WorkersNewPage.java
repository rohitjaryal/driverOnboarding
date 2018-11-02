package or;

import org.openqa.selenium.By;

public class WorkersNewPage {

    public By getName() {
        return By.xpath("//label[text()='Name']/following-sibling::input");
    }

    public By getPhoneNumber() {
        return By.xpath("//label[text()='Phone Number']/following-sibling::input");
    }

    public By getEmail() {
        return By.xpath("//label[text()='Email']/following-sibling::input");
    }

    public By getSaveBtn() {
        return By.xpath("//mini-action-button[@icon='save'] ");
    }

    public By getTitleForVerification() {
        return By.className("panel-title");
    }

    public By getPhoneNumberForVerification(String phoneNumber) {
        return By.linkText(phoneNumber);
    }

    public By getEmailForVerification(String email) {
        return By.linkText(email);
    }

    public By getSmsTokenCheckbox() {
        return By.xpath("//label[@for='use-sms-token']");
    }

    public By getSmsToken() {
        return By.xpath("//label[text()='SMS Token']/following-sibling::input");
    }

}
