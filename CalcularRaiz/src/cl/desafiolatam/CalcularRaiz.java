package cl.desafiolatam;
import java.util.Scanner;

public class CalcularRaiz {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Ingrese un n�mero a calcular su raiz: ");
		double numdob = num.nextDouble();
		
		double raiz = Math.sqrt(numdob);
		System.out.println("La ra�z cuadrada de " + numdob + " es " + raiz);
		
		num.close();
	}
}