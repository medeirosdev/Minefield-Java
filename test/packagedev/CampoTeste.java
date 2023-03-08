package packagedev;

import packagedevmodelo.Campo;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CampoTeste {
	
	private Campo campo = new Campo(3 , 3);
	
	void testeVizinhoReal() {
			Campo vizinho = new Campo(3 , 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
			
	}

}
