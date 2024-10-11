public class ClassFactory {
    
    public static IValidable getValidador(EDatosPersona tipo) {
        switch (tipo) {
            case NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO : return new DatoString();
            default : throw new IllegalArgumentException("Tipo de Edato de Persona no aceptado");
        }
    }

}
