import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[]args){
		Scanner leia = new Scanner(System.in);
		char[][] jogo = new char [3][3];

		while(true){
			int x = 0;
			while(x < 1 || x > 3) {
				System.out.println("Em qual linha voce ira inserir sua jogada? ");
				x = leia.nextInt();
			}
			int y = 0;
			while(y < 1 || y > 3) {
				System.out.println("Em qual coluna voce ira inserir sua jogada? ");
				y = leia.nextInt();
			}
			System.out.println("Voce é o X(chis) ou a O(Bolinha)");
			char jogada = leia.next().charAt(0);
			jogo[x - 1][y - 1] = jogada;
			
			for (char[] linha: jogo) {
				for (char c: linha) {
					if (c == '\0') {
						System.out.print("|_|");
					} else {
						System.out.print("|" + c + "|");
					}
				}
				System.out.print("\n");
			}
		}			
	}
}

