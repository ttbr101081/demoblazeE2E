package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsText;

public class ConfirmationMessage implements Question<String> {

    private final Target messageElement;

    public ConfirmationMessage(Target messageElement) {
        this.messageElement = messageElement;
    }

    public static Question<String> textOf(Target messageElement) {
        return new ConfirmationMessage(messageElement);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(messageElement, isVisible()).forNoMoreThan(10).seconds());
        return messageElement.resolveFor(actor).getText();
    }

    public Question<Boolean> isEqualTo(String expectedMessage) {
        return actor -> {
            String actualMessage = answeredBy(actor);
            return actualMessage.equals(expectedMessage);
        };
    }
     public Question<Boolean> containsText(String expectedText) {
        return actor -> {
            String actualMessage = answeredBy(actor);
            return actualMessage.contains(expectedText);
        };
    }
}
