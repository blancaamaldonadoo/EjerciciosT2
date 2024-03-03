/*EJERCICIO4.1: Diagrama de Clases Avanzado: 
Para el objeto complejo seleccionado (como un teléfono móvil), desarrolla un diagrama de clases UML 
detallado que muestre no solo sus subobjetos y relaciones, sino también herencia, 
interfaces, y relaciones de dependencia/agregación.*/

public class Telefono{

String numeroTelefono;
String marca;
String modelo;
int almacenamiento;
boolean tactil;

public Telefono(String numeroTelefono, String marca, String modelo, int almacenamiento, boolean tactil){ //Constructor de la clase teléfono
    this.numeroTelefono=numeroTelefono;
    this.marca=marca;
    this.modelo=modelo;
    this.almacenamiento=almacenamiento;
    this.tactil=tactil;

}
}

class Iphone extends Telefono{ //herencia (ejemplo de una clase como podía ser Samsung, Huawei, etc.)

    boolean faceID;
    boolean applePay;
    boolean siri;

    public Iphone(String numeroTelefono, String modelo, int almacenamiento){
        super(numeroTelefono, "Apple", modelo, almacenamiento, true);
        
    }

}

interface Camara{ //interfaz
    void hacerFoto();
    void hacerVideo(); //métodos para la interfaz cámara 
    }

interface Llamada{ //interfaz
    void llamar();
    void colgar(); //métodos para la interfaz llamada
    }

class CamaraIphone extends Iphone implements Camara{ //relación de dependencia
    public void hacerFoto(){
        System.out.println("Foto hecha");
    }
    public void hacerVideo(){
        System.out.println("Video grabado");
    }
}

class LlamadaIphone extends Iphone implements Llamada{ //relación de dependencia
    public void llamar(){
        System.out.println("Llamando");
    }
    public void colgar(){
        System.out.println("Colgando");
    }
}

//Para la agregación, utilizamos la batería ya que se puede poner y quitar del teléfono

class bateria{
    int capacidad;
    int porcentaje;
}

class bateriaIphone extends iphone { //agregación

    Bateria= bateria;

    public bateriaIphone{
    this.capacidad=capacidad;
    this.porcentaje=porcentaje;
    this.bateria=new Bateria(capacidad, porcentaje);
    }


}




