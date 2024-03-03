/*EJERCICIO5.2: Crea una simulación donde diferentes tipos de vehículos 
(bicicletas, coches, camiones) son creados y pasados a una función que determina y muestra su movimiento. 
La función debe tratar a todos los vehículos de manera polimórfica, pero cada tipo de vehículo debe 
tener una implementación única de movimiento.*/

public class Vehiculos{
    
    public static void main(String[] args) {
        //Creamos los objetos
        Bicicleta bicicleta1 = new Bicicleta;
        Coche coche1 = new Coche;
        Camion camion1 = new Camion;
        //Creamos la secuencia de eventos
        bicicleta1.moverse();
        coche1.moverse();
        camion1.moverse();
    }

    public Vehiculo(String tipo, String superficie, int numRuedas, int pasajeros){
        this.tipo=tipo;
        this.superficie=superficie;
        this.pasajeros=pasajeros;
        this.numRuedas=numRuedas;
    }

    public moverse(){
        System.out.println("El vehículo se mueve");
    }
}

class Bicicleta extends Vehiculo{
    
    public Bicicleta(String tipo, String superficie, int numRuedas, int pasajeros){
        super("Bicicleta", "Terrestre", 2, 1);
    }

    public void moverse(){
        System.out.println("La bicicleta se mueve pedaleando");
    }

}

class Coche extends Vehiculo{

    public Coche{
    
        super("Coche", "Terrestre", 4, 5)
    }
}

class Camion extends vehículo{

    public Camion{
        super("Camión", "Terrestre", 8, 3)
    }
}

//En este caso, la función moverse() es polimórfica, ya que cada tipo de vehículo tiene una implementación única de movimiento.







