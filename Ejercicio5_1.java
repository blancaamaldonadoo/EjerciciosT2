/*EJERCICIO5.1
 Proyecto de Jerarquía de Herencia: Basándote en el diagrama de clases de vehículos, 
 expande el proyecto para incluir múltiples niveles de herencia 
 (como Vehículo -> Terrestre -> Coche -> Sedán), e incorpora clases abstractas e interfaces
 donde sea apropiado. Implementa métodos específicos en cada nivel de herencia que demuestren 
 comportamientos únicos.*/

public class Vehiculo{
    
    String tipo;
    String superficie; //Aire, carretera, vías, agua...
    String marca;
    String modelo;
    int numRuedas;

    public Vehiculo(String tipo, String superficie, String marca, String modelo, int numRuedas){
        this.tipo=tipo;
        this.superficie=superficie;
        this.marca=marca;
        this.modelo=modelo;
        this.numRuedas=numRuedas;
    }

}

class Terrestre extends Vehiculo{

    public Terrestre{
        super(tipo, "Terrestre", marca, modelo, numRuedas);
    }

}

class Coche extends Terrestre{

    public Coche{
        super("Coche", marca, modelo, 4);
    }

    public void escucharRadio(){
        System.out.println("Escuchando la radio");
    }

}

class Sedan extends Coche{
    
        public Sedan{
            super("Sedan", marca, modelo);
        }
}
