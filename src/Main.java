public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Raúl Oswaldo", "Jiménez", "Aranguren");
        System.out.print("\033[H\033[2J"); //Limpiar pantalla de la consola
        System.out.println("Datos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Primer Apellido: " + persona.getPrimerApellido());
        System.out.println("Segundo Apellido: " + persona.getSegundoApellido());
    }
}
