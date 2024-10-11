import java.util.regex.Pattern;

public class DatoString implements IValidable{

    @Override
    public boolean validarDato(String datoString) throws IllegalArgumentException  {
        String regex = "[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+";  // Solo letras, acentos y letra ñ permitidos
        if (!Pattern.matches(regex, datoString)) {
            throw new IllegalArgumentException("Se deben introducir solo consonantes, vocales y caracteres especiales aceptados por el Alfabeto Español.");
        }
        return true;
    }
}