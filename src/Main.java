public class Main {
    public static void main(String[] args) throws Exception {

        Persona persona = new Persona();
        SolicitarDatos solicitarDatos = new SolicitarDatos();

        System.out.print("\033[H\033[2J"); //Limpiar pantalla de la consola
        solicitarDatos.datoDNI(persona);
        solicitarDatos.datoNombre(persona);
        solicitarDatos.datoPrimerApellido(persona);
        solicitarDatos.datoSegundoApellido(persona);
        solicitarDatos.datoSexo(persona);

        persona.imprimir();

        solicitarDatos.datoFechaNacimiento(persona); // Calcula la edad       
    }
}