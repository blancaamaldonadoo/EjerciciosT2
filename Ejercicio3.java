/*Amplía el escenario del ejercicio original para incluir al menos cinco objetos que interactúan
en una secuencia de eventos (como prepararse por la mañana). 
Desarrolla un diagrama de flujo que muestre la interacción y luego escribe un pseudocódigo 
detallado o un script que simule la secuencia, enfocándote en el envío de mensajes entre objetos 
y el cambio de estado.  */


public class Ejercicio3 {

    public static void main(String[] args) {
        //Creamos los objetos
        libro libro1 = new libro("El Quijote", "Cervantes", 1000, true);
        lampara lampara1 = new lampara(true, "Blanca", 3);
        reloj reloj1 = new reloj(7, 30, 0, true);
        //Creamos la secuencia de eventos
        libro1.leerLibro(lampara1);
        reloj1.sonarAlarma(reloj1);
        despertador1.apagarAlarma(libro1);
    }
    
}
