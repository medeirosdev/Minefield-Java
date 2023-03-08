package packagedevmodelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int linhas , int colunas , int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	

	
	private void gerarCampos() {
		for (int i = 0; i < linhas ; i++) {
			for (int j = 0; j < colunas ; k++) {
				campos.add(new Campo(i,j));
			}
		}
		
	}
	
	private void associarVizinhos() {
		for(Campo c1 : campos) {
			for(Campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
		
	}

	
	private void sortearMinas() {
		
		
	}
	
	
	

}
