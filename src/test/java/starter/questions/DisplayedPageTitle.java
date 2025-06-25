package starter.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DisplayedPageTitle implements Question<Boolean> {

    private final Target pageTitleElement;

    public DisplayedPageTitle(Target pageTitleElement) {
        this.pageTitleElement = pageTitleElement;
    }

    public static Question<Boolean> isVisible(Target pageTitleElement) {
        return new DisplayedPageTitle(pageTitleElement);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(pageTitleElement, isVisible()).forNoMoreThan(10).seconds());
        return pageTitleElement.resolveFor(actor).isDisplayed();
    }
}
