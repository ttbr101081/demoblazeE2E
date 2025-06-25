package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.CheckoutOverviewPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinishPurchase implements Task {

    public static FinishPurchase clickFinishButton() {
        return instrumented(FinishPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutOverviewPage.FINISH_BUTTON)
        );
    }
}
