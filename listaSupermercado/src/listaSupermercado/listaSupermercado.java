package listaSupermercado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listaSupermercado {
	
private static List<String> lista = new ArrayList<>(); 
	
	public static void main(String[] args) {

		
		lista.add("carne");
		lista.add("ensalada");
		lista.add("leche");
		lista.add("bebidas");
		
		System.out.println("Lista Actual del la Lista del supermercado");
		System.out.print(System.lineSeparator());
		mostrarLista();
		
		
		Collections.sort(lista);
		System.out.println("Lista Ordenanda Ascendente");
		System.out.print(System.lineSeparator());
		mostrarLista();
		
		Collections.reverse(lista);
		System.out.println("Lista Ordenanda al revez");
		System.out.print(System.lineSeparator());
		mostrarLista();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Agrega un elemento a la lista ");
		agregarNombre(scanner.next());

		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Agrega un elemento a la lista ");
		agregarNombre(scanner2.next());
		scanner.close();
		scanner2.close();
		
		System.out.println("Lista Actual del la Lista del supermercado");
		mostrarLista();
		System.out.print(System.lineSeparator());
		
		
		System.out.println("Cambiamos el valor del primer indice");
		modificarNombre(1, "refresco");
		mostrarLista();
		System.out.print(System.lineSeparator());
		
		
		
		System.out.println("Eliminamos el segundo indice");
		eliminarNombre(2);
		mostrarLista();
		System.out.print(System.lineSeparator());
		
		
		
		mostrarLista();
		
	}
	
	public static void agregarNombre(String nombre) {
		lista.add(nombre);
    }
	
	public static void modificarNombre(int indice, String nombre) {
        if (indice >= 0 && indice < lista.size()) {
            lista.set(indice, nombre);
        } else {
            throw new IndexOutOfBoundsException("El índice está fuera de rango");
        }
    }
	
	public static void eliminarNombre(int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            throw new IndexOutOfBoundsException("El índice está fuera de rango");
        }
    }
	
	public static void mostrarLista() {
		System.out.println("Lista de compras:");
		for (String elemento : lista) {
			System.out.println("- " + elemento);
		}
		System.out.println();
	}
	
	
}
