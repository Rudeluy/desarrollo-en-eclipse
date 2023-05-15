package cl.desafiolatam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {
		
		List<Pacient> listaPacientes = new ArrayList<>();

        // Agregar pacientes estáticos
        listaPacientes.add(new Pacient(1,"Juan", "Pérez", 26, "Fonasa","Fiebre alta","A"));
        listaPacientes.add(new Pacient(2,"Peter", "Lory", 56, "Fonasa","Dolor intenso","C"));
        listaPacientes.add(new Pacient(3,"Ana", "Arriaga", 16, "Isapre","Fractura pierna","A"));
        listaPacientes.add(new Pacient(4,"Luisa", "Godoy", 45, "Fonasa","Amigdalitis","B"));
        listaPacientes.add(new Pacient(5,"Tomás", "Gonzalez", 27, "Isapre","Malestar general","D"));

        // Exportar pacientes a archivo
        try {
            FileWriter writer = new FileWriter("pacientes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (Pacient paciente : listaPacientes) {
                bufferedWriter.write(paciente.getNum() + ";" + paciente.getNombre() + "\t" + paciente.getApellido() + ";" + paciente.getEdad() + ";" + paciente.getPrevision() + ";" + paciente.getMotivo() + ";" + paciente.getCategoria() + "\n");
            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
    }

}