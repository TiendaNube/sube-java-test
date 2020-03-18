import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * Modelar el uso de la tarjeta Sube, para los siguientes casos de uso:
 * + Revisar la implementación actual y hacer los cambios que crea necesario.
 * + Agregar fondos a la tarjeta. Si el saldo actual es menor que cero el monto mínimo a cargar debe ser de 50 pesos.
 *      Ejemplo: si tengo -20 pesos, el monto mínimo a cargar debe ser 50 pesos.
 * + Registrar un nuevo viaje y descontar el saldo, teniendo en cuenta que:
 *      - Se aplicará un descuento del 10% si el tiempo transcurrido entre el viaje actual y el último es menor a una hora.
 *      - Si el saldo resultante es menor a -50 pesos no se podrá realizar el viaje.
 * + Se bonificará al usuriao con un 15% de descuento sobre lo consumido en el mes anterior, si el promedio diario
 *      en días habiles fue de cinco viajes.
 *      Emjemplo: durante el mes de Marzo todos los dias habiles un usuario hace cinco viajes de 20 pesos cada uno.
 *      Asumiendo que hay 20 dias habiles se lo bonificará con 300 pesos.
 */

public class Sube {
    private String cardId;
    public BigDecimal amount = BigDecimal.ZERO;
    public LocalDateTime lastTrip = null;

    public Sube(String cardId) {
        this.cardId = cardId;
    }

    public void addFounds(BigDecimal amount) {
        this.amount = this.amount.add(amount);
    }

    public void travel(BigDecimal amount) {
        this.amount = this.amount.subtract(amount);
    }

    public static void main(String[] args) {

    }
}