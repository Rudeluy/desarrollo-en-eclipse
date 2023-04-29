package cl.desafiolatam;

import java.util.Scanner;

public class CalcularPromedioEstudiante {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del estudiante: ");
	    String nombre_completo = input.nextLine();

	    System.out.println("Ingrese nombre de la asignatura: ");
	    String asignatura = input.nextLine();

	    System.out.println("Ingrese nombre del docente: ");
	    String docente = input.nextLine();

	    System.out.print("Ingrese la nota 1: ");
	    double nota1 = input.nextDouble();

	    System.out.print("Ingrese la nota 2: ");
	    double nota2 = input.nextDouble();

	    System.out.print("Ingrese la nota 3: ");
	    double nota3 = input.nextDouble();
		
	    double promedio = (nota1 + nota2 + nota3) / 3;
	    
	    System.out.printf("\nNombre del alumno: %s ",nombre_completo );
	    System.out.printf("\nAsignatura: %s", asignatura);
	    System.out.println("\nDocente: " + docente);
	    System.out.println("\nPromedio de notas: " + promedio);
	    
	    input.close();
		
	}

}
