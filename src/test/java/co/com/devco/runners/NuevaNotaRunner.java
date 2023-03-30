package co.com.devco.runners;

import com.google.common.jimfs.Feature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\nuevanota.feature",
        glue = "co.com.devco.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class NuevaNotaRunner {
}
