package userInterface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedadPage {

	public static final Target SEARCH_BUTTON = Target.the("Serch  Button").located(By.xpath("(//*[@id=\"js-site-search-input\"])[1]"));
	public static final Target SEARCH = Target.the("Search ").located(By.xpath("(//span[contains(text(),'Buscar')])[2]"));
	public static final Target ADD_TO_CART= Target.the("Add to cart ").located(By.xpath("(//button[contains(text(),'Agregar al carrito')])[1]"));
	public static final Target VALIDATE_TO_CART= Target.the("Validate to cart ").located(By.xpath("//*[@class='font-title font-title--sub-title-3 ']"));
	public static final Target GO_TO_CART= Target.the("Go to cart ").located(By.xpath("(//button[contains(text(),'Ir al carrito')])[2]"));

	
}
