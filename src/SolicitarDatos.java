import java.io.Console;

public class SolicitarDatos {
    Console console = System.console();

    public void datoDNI(Persona persona) {

        // Solicitar y validar el DNI
        boolean DNIValido = false;
        while (!DNIValido) {
            try {                    
                String DNI = console.readLine("Introduce el DNI: "); 
                persona.setDNI(DNI.toUpperCase()); // Convertir a mayúsculas, Valida y asigna el DNI
                DNIValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }

    public void datoNombre(Persona persona) {

        // Solicitar y validar el nombre
        boolean nombreValido = false;
        while (!nombreValido) {
            try {                    
                String nombre = console.readLine("Introduce el nombre: ");
                persona.setNombre(nombre.toUpperCase()); // Valida y asigna el nombre
                nombreValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }

    public void datoPrimerApellido(Persona persona) {

        // Solicitar y validar el primer apellido
        boolean primerApellidoValido = false;
        while (!primerApellidoValido) {
            try {                    
                String primerApellido = console.readLine("Introduce el primer apellido: ");
                persona.setPrimerApellido(primerApellido.toUpperCase()); // Valida y asigna el primer apellido
                primerApellidoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }

    public void datoSegundoApellido(Persona persona) {

        // Solicitar y validar el segundo apellido
        boolean segundoApellidoValido = false;
        while (!segundoApellidoValido) {
            try {                    
                String segundoApellido = console.readLine("Introduce el segundo apellido: ");
                persona.setSegundoApellido(segundoApellido.toUpperCase()); // Valida y asigna el segundo apellido
                segundoApellidoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }

    public void datoSexo(Persona persona) {

        // Solicitar y validar el sexo
        boolean sexoValido = false;
        while (!sexoValido) {
            try {                    
                String sexo = console.readLine("Introduce el sexo (H para Hombre, M para Mujer): ");
                persona.setSexo(sexo.substring(0, 1).toUpperCase()); // Captura solo la primera letra, valida y asigna el sexo
                sexoValido = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }

    public void datoFechaNacimiento(Persona persona) {

        // Solicitar y validar la fecha de nacimiento
        boolean fechaValida = false;
        while (!fechaValida) {
            try {                    
                String fechaNacimiento = console.readLine("Introduce la fecha de nacimiento (dd/MM/yyyy): ");
                persona.setFechaNacimiento(fechaNacimiento); // Valida y asigna la fecha de nacimiento
                fechaValida = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Inténtelo de nuevo. ");
            } 
        }        
    }
}
