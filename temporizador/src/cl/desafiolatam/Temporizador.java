package cl.desafiolatam;

import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int segundos = validaSegundos("\nIngrese la cantidad de segundos \n", input);
		
		while (segundos > 0) {
            System.out.println("segundos restantes: " + segundos);
            segundos--;
            try {
                Thread.sleep(1000); // espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Temporizador finalizado");
		
	}
	
	public static int validaSegundos(String mensaje, Scanner input) {
        System.out.printf(mensaje);
        while (!input.hasNextInt()) {
            System.out.println("Error ... debe ingresar un número Entero");
            input.next();
        }
        return input.nextInt();
    }
}