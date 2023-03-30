package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.userinterfaces.PaginaPrincipal.*;
import static co.com.devco.utils.Constantes.NOTA;

public class NuevaNotaEnriquecida implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NOTA_ENRIQUECIDA),
                WaitUntil.the(BTN_NEGRILLA, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NEGRILLA),
                Enter.theValue(NOTA).into(INPUT_EDITOR),
                Scroll.to(BTN_GUARDAR).andAlignToTop(),
                Click.on(BTN_GUARDAR)

        );
    }

    public static NuevaNotaEnriquecida with() {
        return Tasks.instrumented(NuevaNotaEnriquecida.class);
    }
}

