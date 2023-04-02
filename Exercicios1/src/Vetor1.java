//exercicio 1, 2 




import java.util.Scanner;

public class Vetor1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		int n = 10;
		int v[] = new int [n];
		int i;
		
		for (i=0; i < n; i++) {
			System.out.printf("Qual valor ira ocupar o %do. lugar de %d?", i+1, n);
			v[i] = leia.nextInt();
		}
		int menor = v[0];
		int maior = v[0];
		int soma = 0;
		int posiçãoM = 0;
		int posiçãoN = 0;
		
		for (i=0; i < n; i++) {
			soma += v[i];
			if (v[i] < menor){
				 menor = v[i];
				 posiçãoN = i;
			}
			if (v[i] > maior) {
				 maior = v[i];
				 posiçãoM = i;
			}
		}
		System.out.printf("O resultado da operaçaõ ficou em: \n Maior valor = %d, posicao %d -  \n Menor valor = %d, posicao %d \n A soma ficou em: %d", maior, posiçãoM, menor, posiçãoN, soma);
		
	}
		 
}

