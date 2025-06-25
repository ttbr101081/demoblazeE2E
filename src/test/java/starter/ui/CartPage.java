package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target TITLE = Target.the("cart page title")
            .located(By.xpath("//span[@class='title' and text()='Your Cart']"));
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button")
            .located(By.id("checkout"));
}
