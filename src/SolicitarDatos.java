import java.io.Console;

public class SolicitarDatos {
    Console console = System.console();

    public void datoNombre(Persona persona) {

        try {
            // Solicitar y validar el nombre
            boolean nombreValido = false;
            while (!nombreValido) {
                try {                    
                    String nombre = console.readLine("Introduce el nombre: ");
                    persona.setNombre(nombre); // Valida y asigna el nombre
                    nombreValido = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    System.out.print("Inténtelo de nuevo. ");
                } 
            }
        } finally {
            System.out.println("Validación del nombre [ "+ persona.getNombre() +" ] realizada con éxito.");
        }
    }
}
