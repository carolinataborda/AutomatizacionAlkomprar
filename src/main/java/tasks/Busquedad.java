package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.statematchers.IsEnabledMatcher;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.BusquedadPage;
import util.ConstantValues;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import exceptions.ObjetoNoCarga;
import exceptions.PaginaNoEncontrada;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Busquedad implements Task {

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
	actor.attemptsTo(
			Enter.theValue(ConstantValues.TV).into(BusquedadPage.SEARCH_BUTTON));
			}
		catch (Exception e) { new ObjetoNoCarga(e.getMessage(), e.getCause());}
		
		actor.attemptsTo(
			Click.on(BusquedadPage.SEARCH),
			Scroll.to(BusquedadPage.ADD_TO_CART).andAlignToBottom(),
			Click.on(BusquedadPage.ADD_TO_CART),
			Click.on(BusquedadPage.GO_TO_CART)
			);
		
	}
	
	public static Busquedad of() {
		return instrumented (Busquedad.class);
	}

}
