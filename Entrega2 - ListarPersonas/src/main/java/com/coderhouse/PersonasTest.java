package com.coderhouse;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PersonasTest {

	public static void main(String[] args) {
        // creo lista para almacenar los nombres y apellidos
        List<Persona> listaPersonas = new ArrayList<>();
        
        // creo los 5 objetos y les doy sus valores y los agrego a la listaPersonas
        Persona persona1 = new Persona();
        persona1.setNombre("Santiago");
        persona1.setApellido("Gonzalez");
        listaPersonas.add(persona1);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Leonardov");
        persona2.setApellido("Manriquez");
        listaPersonas.add(persona2);
        
        Persona persona3 = new Persona();
        persona3.setNombre("Esmeraldo");
        persona3.setApellido("Perez");
        listaPersonas.add(persona3);
        
        Persona persona4 = new Persona();
        persona4.setNombre("Mariana");
        persona4.setApellido("Trompada");
        listaPersonas.add(persona4);
        
        Persona persona5 = new Persona();
        persona5.setNombre("Monica");
        persona5.setApellido("Farro");
        listaPersonas.add(persona5);

        // creo dos listas nuevas para separar nombres y apellidos
        List<String> nombres = new ArrayList<>();
        List<String> apellidos = new ArrayList<>();
        
        // uso un for para recorrer la listaPersonas y separar nombres x un lado y apellidos por otro, en sus respectivas listas
        for (Persona persona : listaPersonas) {
            nombres.add(persona.getNombre());
            apellidos.add(persona.getApellido());
        }
        
        // utilizo el metodo collections.sort para ordenarlos alfabeticamente, (otro no vimos en clase creo)
        // y uso un for para recorrer e imprimirlos
        Collections.sort(nombres);
        System.out.println("Nombres A-Z:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        Collections.sort(apellidos);
        System.out.println("\nApellidos A-Z: ");
        for (String apellido : apellidos) {
            System.out.println(apellido);
        }
        
        Collections.sort(apellidos, Collections.reverseOrder());          
            System.out.println("\nApellidos Z-A: ");
        for (String apellido : apellidos) {
            System.out.println(apellido);
        }
        
    }
    
}
