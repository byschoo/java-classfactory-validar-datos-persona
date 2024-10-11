import java.util.regex.Pattern;

public class Dato_NombApll implements IValidable{

    @Override
    public boolean validarDato(String check) throws IllegalArgumentException  {
        String regex = "[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+";  // Solo letras, acentos y letra ñ permitidos
        if (!Pattern.matches(regex, check)) {
            throw new IllegalArgumentException("Se deben introducir solo consonantes, vocales y caracteres especiales aceptados por el Alfabeto Español.");
        }
        return true;
    }
}