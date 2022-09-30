import java.util.Locale;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[] nipes = { "Ouros", "Copas", "Espadas", "Paus" };
		String[] faces = { "Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei" };

		// As linhas abaixo retornam de forma aleatoria o conteudo dos arrays

		String nipe = nipes[(int) Math.random() * 4];
		String face = faces[(int) (Math.random() * faces.length)];

		// A proxima linha mostra a carta sorteada

		System.out.println(face + " de " + nipe);

	}

}
