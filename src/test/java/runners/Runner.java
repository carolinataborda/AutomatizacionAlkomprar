package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		
		features = "src/test/resources/Reto.feature",
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE,
		tags = "@Escenario1"
		
)

public class Runner {

}
