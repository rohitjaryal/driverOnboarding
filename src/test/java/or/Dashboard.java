package or;

import org.openqa.selenium.By;

public class Dashboard {

    public By getLeftNavigationBar() {
        return By.xpath("//div[@class='icon-thumbnail clickable']");
    }

    public By getNavigationBarMenu(String menuName) {
        return By.xpath("//a/span[text()='" + menuName + "']");
    }


}
