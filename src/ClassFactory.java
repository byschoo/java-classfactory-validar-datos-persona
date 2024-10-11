public class ClassFactory {
    
    public static IValidable getValidador(EDatosPersona tipo) throws IllegalArgumentException{
        switch (tipo) {
            case NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO : return new Dato_NombApll();
            case DNI : return new Dato_DNI();
            case SEXO : return new Dato_Sexo();
            case FECHA_NACIMIENTO : return new Dato_FechaNacimiento();
            default : throw new IllegalArgumentException("Tipo de ENUM dato de Persona no establecido.");
        }
    }
}
