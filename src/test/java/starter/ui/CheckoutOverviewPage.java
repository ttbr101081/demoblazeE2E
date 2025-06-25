package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {
    public static final Target TITLE = Target.the("checkout overview page title")
            .located(By.xpath("//span[@class='title' and text()='Checkout: Overview']"));
    public static final Target FINISH_BUTTON = Target.the("finish button")
            .located(By.id("finish"));
}
