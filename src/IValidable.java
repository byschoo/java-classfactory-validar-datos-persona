import java.util.regex.PatternSyntaxException;

public interface IValidable {
    public boolean validarDato(String datoString) throws PatternSyntaxException;  
}
