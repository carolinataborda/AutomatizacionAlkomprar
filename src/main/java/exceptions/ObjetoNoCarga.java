package exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ObjetoNoCarga  extends Exception {
	
	 public static final String OBJETO_NO_ENCONTRADO="Objeto No encontrado";
	    
	    public ObjetoNoCarga(String message, Throwable cause) {
	    	
	        super(message, cause);
	    
	    }
}
