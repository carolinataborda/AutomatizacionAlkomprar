package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterface.BusquedadPage;

public class Validate implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(BusquedadPage.VALIDATE_TO_CART).viewedBy(actor).asString();
	}
	
	public static Validate is() {
		return new Validate();
		}

}
