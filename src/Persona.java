import java.util.regex.PatternSyntaxException;

public class Persona {
    //ATRIBUTOS
    private String nombre,
            primerApellido,
            segundoApellido;
        
    //CONTSTRUCTORES
    public Persona() {}

    public Persona(String nombre){
        setNombre(nombre);
    }

    public Persona (String nombre, String primerApellido, String segundoApellido) {
        setNombre(nombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
    }

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    // SETTERS con validación usando la Class Factory y los validadores específicos
    public void setNombre(String nombre) throws PatternSyntaxException {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.NOMBRE);
        if (iValidable.validarDato(nombre)) {
            this.nombre = nombre;
        }
    }
    
    public void setPrimerApellido(String primerApellido) throws PatternSyntaxException {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.PRIMER_APELLIDO);
        if (iValidable.validarDato(primerApellido)) {
            this.primerApellido = primerApellido;
        }
    }
    
    public void setSegundoApellido(String segundoApellido) throws PatternSyntaxException {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.SEGUNDO_APELLIDO);
        if (iValidable.validarDato(segundoApellido)) {
            this.segundoApellido = segundoApellido;
        }
    }
}
