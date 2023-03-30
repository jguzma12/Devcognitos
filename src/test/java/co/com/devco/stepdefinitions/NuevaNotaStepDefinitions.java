package co.com.devco.stepdefinitions;

import co.com.devco.questions.ValidacionNotaNueva;
import co.com.devco.tasks.NuevaNotaEnriquecida;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class NuevaNotaStepDefinitions {
    @Managed
    private WebDriver driver;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Actor");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @Dado("^Yo como usuario ingreso a la pagina$")
    public void yoComoUsuarioIngresoALaPagina() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));

    }

    @Cuando("^Yo creo una nueva nota de texto enriquecido en negrilla$")
    public void yoCreoUnaNuevaNotaDeTextoEnriquecidoEnNegrilla() {
        OnStage.theActorInTheSpotlight().attemptsTo(NuevaNotaEnriquecida.with());

    }

    @Entonces("^Yo veo una nota en negrilla$")
    public void yoVeoUnaNotaEnNegrilla() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionNotaNueva.exitoso(), Matchers.is(true)));

    }
}
