package packagedev;
import packagedevmodelo.Tabuleiro;
import packagedevvisao.TabuleiroConsole;

public class app {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		TabuleiroConsole tabuleiroco = new TabuleiroConsole(tabuleiro);
		


	}

}
