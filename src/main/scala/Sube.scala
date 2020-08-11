import java.math.BigDecimal
import java.time.LocalDateTime

/**
 * Modelar el uso de la tarjeta Sube, para los siguientes casos de uso:
 * + Revisar la implementación actual y hacer los cambios que crea necesario.
 * + Agregar fondos a la tarjeta. Si el saldo actual es menor que cero el monto mínimo a cargar debe ser de 50 pesos.
 *      Ejemplo: si tengo -20 pesos, el monto mínimo a cargar debe ser 50 pesos.
 * + Registrar un nuevo viaje y descontar el saldo, teniendo en cuenta que:
 *      - Se aplicará un descuento del 10% si el tiempo transcurrido entre el viaje actual y el último es menor a una hora.
 *      - Si el saldo resultante es menor a -50 pesos no se podrá realizar el viaje.
 * + Se bonificará al usuriao con un 15% de descuento sobre lo consumido en el mes anterior si en promedio hizo tres viajes por día. Teniendo en
 *      cuenta unicamente los días hábiles.
 *      Emjemplo 1: durante el mes de Marzo todos los dias habiles un usuario hacen tres viajes de 20 pesos cada uno.
 *      Asumiendo que hay 20 dias habiles se lo bonificará con 180 pesos (15% de $1200).
 *.     Ejemplo 2: durante el mes de Marzo todos los Lunes, Miercoles y Viernes, se realizan 9 viajes en cada uno de esos dias respectivamente.
 *      Asumiendo que hay 20 dias habiles el promedio por día es de 5,4 viajes por día, bonificando $324 (15% de $2160).
 */

object Sube {
  def main(args: Array[String]): Unit = {
  }
}

class Sube(var cardId: String) {
  var amount: BigDecimal = BigDecimal.ZERO
  var lastTrip: LocalDateTime = null

  def addFounds(amount: BigDecimal): Unit = {
    this.amount = this.amount.add(amount)
  }

  def travel(amount: BigDecimal): Unit = {
    this.amount = this.amount.subtract(amount)
  }
}
