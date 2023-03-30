package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.devco.userinterfaces.PaginaPrincipal.ALERTA;

public class ValidacionNotaNueva implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return ALERTA.resolveFor(actor).isVisible();
    }
public static ValidacionNotaNueva exitoso(){
return new ValidacionNotaNueva();
}
}
