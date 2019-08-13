package exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;


public class PaginaNoEncontrada extends Exception {
 
    public static final String PAGINA_NO_INICIA="Pagina no inicia por las siguientes razones: ";
    
    public PaginaNoEncontrada(String message, Throwable cause) {
        super(PAGINA_NO_INICIA+message, cause);
    
    }
 
}