import java.util.regex.Pattern;

public class Dato_DNI implements IValidable{

    @Override
    public boolean validarDato(String check) throws IllegalArgumentException {
        String regex = "^[0-9]{8}[A-Za-zñÑ]$";  // 8 dígitos seguidos de una letra, sin espacios
        if (!Pattern.matches(regex, check)) {
            throw new IllegalArgumentException("Se deben introducir solo 8 dígitos seguidos de una letra, sin espacios.");
        }
        return true;
    }

}
