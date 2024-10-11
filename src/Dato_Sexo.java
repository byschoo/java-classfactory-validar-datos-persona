public class Dato_Sexo implements IValidable {

    @Override
    public boolean validarDato(String check) throws IllegalArgumentException {

        if (!(check.equals("H") || check.equals("M"))) {
            throw new IllegalArgumentException("Se debe introducir (H para Hombre, M para Mujer).");
        }
        return true;
    }
}
