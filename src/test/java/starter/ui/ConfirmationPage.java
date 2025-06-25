package starter.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage {
    public static final Target COMPLETE_HEADER = Target.the("confirmation complete header")
            .located(By.className("complete-header"));
}
