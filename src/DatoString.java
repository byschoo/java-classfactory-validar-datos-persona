import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class DatoString implements IValidable{

    @Override
    public boolean validarDato(String datoString) throws PatternSyntaxException  {
        String regex = "[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+";  // Solo letras, acentos y letra ñ
        if (!Pattern.matches(regex, datoString)) {
            throw new PatternSyntaxException("Se deben introducir solo letras y vocales acentuadas de acuerdo al Alfabeto Español.", regex, -1);
        }
        return true;
    }
}

// try{
//     return datoString.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑüÜ\\s]+");
// }catch (Exception e) {
//     // TODO: handle exception
// }