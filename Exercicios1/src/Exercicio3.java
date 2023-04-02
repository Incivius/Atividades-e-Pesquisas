import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
	double vetor[] = new double[10];
	int valorInicial = 0;
	double razao;

	
	System.out.printf("Qual é o valor inicial? ");
	valorInicial = leia.nextInt();
	System.out.printf("Qual é a razao da sequencia? ");	
	razao = leia.nextDouble();
	double proximoNúmero = valorInicial;

	for(int i = 0; i < 10; i++) {
		vetor[i] = proximoNúmero;
		proximoNúmero = proximoNúmero * razao; // pg
		proximoNúmero = valorInicial + (i * razao); // pa
		System.out.println(vetor[i]);
		}
	}
}
