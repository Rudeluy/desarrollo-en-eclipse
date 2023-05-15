package cl.desafiolatam;
import java.util.ArrayList;
import java.util.List;

public class Urgencia {

	public static void main(String[] args) {
		
		List<Pacient> urgenciaLista = new ArrayList<Pacient>();
		
		urgenciaLista.add(new Pacient(1,"Juan", "Pérez", 26, "Fonasa","Fiebre alta","A"));
		urgenciaLista.add(new Pacient(2,"Peter", "Lory", 56, "Fonasa","Dolor intenso","C"));
		urgenciaLista.add(new Pacient(3,"Ana", "Arriaga", 16, "Isapre","Fractura pierna","A"));
		urgenciaLista.add(new Pacient(4,"Luisa", "Godoy", 45, "Fonasa","Amigdalitis","B"));
		urgenciaLista.add(new Pacient(5,"Tomás", "Gonzalez", 27, "Isapre","Malestar general","D"));

		
		for (Pacient Pacient : urgenciaLista) {
			System.out.println(Pacient);	
		}
		
		System.out.print(System.lineSeparator());
		
		int cuenta = 0;
		
		for(int i = 0; i<urgenciaLista.size();i++) {
			if(urgenciaLista.get(i).getCategoria().equals("A")) {
				System.out.println("Nombre: "+ urgenciaLista.get(i).getNombre()+" "+urgenciaLista.get(i).getApellido()+", Categoría: "+urgenciaLista.get(i).getCategoria());
				cuenta+=1;
			}
		}
		
		System.out.println("Cantidad de Pacients: "+cuenta);
		
		System.out.print(System.lineSeparator());
		
		int cuenta2 = 0;
		for(int i = 0; i<urgenciaLista.size();i++) {
			if(urgenciaLista.get(i).getEdad()>=18) {
				System.out.println("Nombre: "+ urgenciaLista.get(i).getNombre()+" "+urgenciaLista.get(i).getApellido()+", Edad: "+urgenciaLista.get(i).getEdad()+", Categoría: "+urgenciaLista.get(i).getCategoria());
				cuenta2+=1;
			}
		}
		System.out.print(System.lineSeparator());
		System.out.println("Cantidad de Pacients: "+cuenta2);
		System.out.print(System.lineSeparator());
		
		for(int i = 0; i<urgenciaLista.size();i++) {
			if(urgenciaLista.get(i).getNum()==1) {
				urgenciaLista.get(i).setCategoria("E");
				System.out.println("Nombre: "+ urgenciaLista.get(i).getNombre()+" "+urgenciaLista.get(i).getApellido()+", Categoría: "+urgenciaLista.get(i).getCategoria());

			}
		}
		
		System.out.print(System.lineSeparator());
		int cuenta3 = 0;
		for(int i = 0; i<urgenciaLista.size();i++) {
			if(urgenciaLista.get(i).getPrevision().equals("Fonasa")) {
				System.out.println("Nombre: "+ urgenciaLista.get(i).getNombre()+" "+urgenciaLista.get(i).getApellido()+", Prevision: "+urgenciaLista.get(i).getPrevision());
				cuenta3+=1;
			}
		}
		System.out.println("Cantidad de Pacients: "+cuenta3);
		
		System.out.print(System.lineSeparator());
		

	}

}