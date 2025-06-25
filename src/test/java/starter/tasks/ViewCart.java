package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ViewCart implements Task {

    public static ViewCart clickCartIcon() {
        return instrumented(ViewCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.SHOPPING_CART_ICON)
        );
    }
}
