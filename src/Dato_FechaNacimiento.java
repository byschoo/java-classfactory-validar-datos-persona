import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Dato_FechaNacimiento implements IValidable{

    @Override
    public boolean validarDato(String check) throws IllegalArgumentException {

        // Definir el formato de la fecha (por ejemplo, día/mes/año)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // Convertir el String a LocalDate usando el formato especificado
            LocalDate fecha = LocalDate.parse(check, formatter);
            
            // Calcular la edad
            int edad = calcularEdad(fecha, LocalDate.now());
            System.out.println("La edad actual es de [ " + edad + " años ]");
        
            return true;            
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException ("Se debe introducir la fecha en este formato (dd/MM/yyyy).");
        }
    }


    // Método que calcula la edad a partir de la fecha de nacimiento
    public int calcularEdad(LocalDate fechaNacimiento, LocalDate fechaActual) {
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

}
