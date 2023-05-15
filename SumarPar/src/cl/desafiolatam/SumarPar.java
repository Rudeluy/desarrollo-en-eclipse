package cl.desafiolatam;

import java.util.Scanner;

public class SumarPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		int numero = validaInt("\nIngrese el numero más alto de la sumatoria de numeros divisible por 2 \n", input);
		
		
		int i= 0 ;
		int sumatoria = 0;
		while (numero > i) {
            if(i % 2 == 0) {
            	
        		System.out.println("se suma " + i);
        		sumatoria = sumatoria+i;
                i++;
                try {
                    Thread.sleep(200); // espera 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
            	i++;
            }
        }
		
		System.out.println("El total de la sumatoria de numeros del 1 al "+ numero + " es : " + sumatoria);
		
	}
	
	public static int validaInt(String mensaje, Scanner input) {
        System.out.printf(mensaje);
        while (!input.hasNextInt()) {
            System.out.println("Error ... debe ingresar un número Entero");
            input.next();
        }
        return input.nextInt();
    }
}
