package stepDefinitions;


import java.nio.channels.SeekableByteChannel;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.filters.TokenFilter.ContainsString;
import org.jsoup.select.Evaluator.ContainsText;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.PaginaNoEncontrada;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.matchers.statematchers.ContainsTextMatcher;
import net.thucydides.core.annotations.Managed;
import questions.Validate;
import tasks.Busquedad;
import tasks.OpenTheBrowser;
import userInterface.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;


public class RetoStepDefinitions {


	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor carolina = Actor.named("Carolina");
	private HomePage homePage;

	@Before
	public void setUp() {
		carolina.can(BrowseTheWeb.with(hisBrowser));
		hisBrowser.manage().window().maximize();
		hisBrowser.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
	}
	
	    @Given("^que un usuario quiere ingresa en la pagina de alkomprar para comprar articulos$")
	    public void que_un_usuario_quiere_ingresa_en_la_pagina_de_alkomprar_para_comprar_articulos() {
	    	carolina.wasAbleTo(OpenTheBrowser.on(homePage));
	    
	    }

	    @When("^el usuario selecciona un articulo para comprar$")
	    public void el_usuario_selecciona_un_articulo_para_comprar() {
	    	carolina.attemptsTo(Busquedad.of());
	    }

	    @Then("^debe ver en el carrito de compras el articulo y cantidad seleccionada$")
	    public void debe_ver_en_el_carrito_de_compras_el_articulo_y_cantidad_seleccionada()  {
	        carolina.should(seeThat(Validate.is(), containsString("Productos en el carrito") ));
	    }

	
}
