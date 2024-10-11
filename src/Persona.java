public class Persona {
    // ATRIBUTOS
    private String DNI,
            nombre,
            primerApellido,
            segundoApellido,
            sexo,
            fechaNacimiento;

    // CONTSTRUCTORES
    public Persona() {
    }

    public Persona(String DNI, String nombre, String primerApellido, String segundoApellido, String sexo, String fechaNacimiento) {
        setDNI(DNI);
        setNombre(nombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
        setSexo(sexo);
        setFechaNacimiento(fechaNacimiento);
    }


    // GETTERS
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // SETTERS con validación usando la Class Factory y los validadores específicos
    public void setDNI(String DNI) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.DNI);
        if (iValidable.validarDato(DNI)) {
            this.DNI = DNI;
        }
    }

    public void setNombre(String nombre) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.NOMBRE);
        if (iValidable.validarDato(nombre)) {
            this.nombre = nombre;
        }
    }

    public void setPrimerApellido(String primerApellido) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.PRIMER_APELLIDO);
        if (iValidable.validarDato(primerApellido)) {
            this.primerApellido = primerApellido;
        }
    }

    public void setSegundoApellido(String segundoApellido) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.SEGUNDO_APELLIDO);
        if (iValidable.validarDato(segundoApellido)) {
            this.segundoApellido = segundoApellido;
        }
    }
    
    public void setSexo(String sexo) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.SEXO);
        if (iValidable.validarDato(sexo)) {
        this.sexo = sexo;
        }
    }    

    public void setFechaNacimiento(String fechaNacimiento) {
        IValidable iValidable = ClassFactory.getValidador(EDatosPersona.FECHA_NACIMIENTO);
        if (iValidable.validarDato(fechaNacimiento)) {
            this.fechaNacimiento = fechaNacimiento;
        }        
    }

    //COMPORTAMIENTOS
    public void imprimir() {             
        System.out.println("Validación del DNI: [ "+ getDNI() +" ] realizado con éxito.");
        System.out.println("Validación del nombre: [ "+ getNombre() +" ] realizado con éxito.");
        System.out.println("Validación del primer apellido: [ "+ getPrimerApellido() +" ] realizado con éxito.");
        System.out.println("Validación del segundo apellido: [ "+ getSegundoApellido() +" ] realizado con éxito.");
        System.out.println("Validación del sexo: [ "+ (getSexo().equals("H") ? "Hombre" : "Mujer") +" ] realizado con éxito.");
    }
}