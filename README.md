# JAVA - ClassFactory
Se crearon cuatro clases: Main, Persona, DatoString y ClassFactory. Una clase ENUM inicialmente con los datos String de una Persona como NOMBRE, PRIMER_APELLIDO, SEGUNDO_APELLIDO. Una Interfase IValidable con un método obligatorio booleano para validar los datos mencionados.

## Herramientas Utilizadas
1. Clases con atributos privados, constructores que validan los atributos a través de los métodos setters, y getters para imprimir los datos, try-catch-finally para controlar los errores al introducir los datos por el usuario.

2. **System.out.print("\033[H\033[2J")** Limpia la pantalla

3. Estructura de control **Try-Catch-Finally** que ayuda a controlar los errores en la validación de los datos y la recursividad al solicitar nuevamente su lectura. La excepción **IllegalArgumentException** es lanzada por la expresión regular **"[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+"** si no se cumple.

4. Validación y Asignación:
`public  void  setNombre(String  nombre) throws  PatternSyntaxException {
IValidable iValidable = ClassFactory.getValidador(EDatosPersona.NOMBRE);
    if (iValidable.validarDato(nombre)) {
		this.nombre = nombre;
	}}`
	
	SetNombre se encarga de que la interfaz iValidable haga referencia a la Clase DatoString, por la ClassFactory, y Override el método validarDato(nombre) que valida y asigna el nombre.

5. **System.console()** para leer el nombre adecuadamente en vez de **Scanner()** que daba muchos problemas al introducir tildes y la letra ñ.

6. Se hace explicita que la interfaz puede lanzar la excepción **IllegalArgumentException** y que al diseñar su implementación se debe añadir un try-catch.
