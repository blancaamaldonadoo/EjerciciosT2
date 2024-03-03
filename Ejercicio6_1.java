/*EJERCICIO6.1
Ensayo sobre Polimorfismo: Escribe un ensayo detallado que explique el concepto de 
polimorfismo en la programación orientada a objetos, con ejemplos de código
en un lenguaje de programación de tu elección. Discute cómo el polimorfismo contribuye 
a la flexibilidad y mantenibilidad del código.



El polimorfismo en una de las herramientas más importantes y útiles en la progrmación orientada a objetos.

El polimorfismo es unq herramienta de abstracción que permite que el código no sufra alteraciones 
al incluir clases que hereden de otras; es decir, que no haya error en el paso de la información de una 
clase padre a una clase hija.

El polimorfismo permite tratar a los objetos de una manera genera, sin importar ser un tipo de una clase
específica, sino que es entendido como un único tipo. De esta manera, el programador podrá crear un 
código mucho más flexible y mantenible, ya que no tendrá que modificarlo cada vez que se añada una nueva clase.

Estas ventajas del polimorfismo se pueden obtener de distintas maneras. Son los distintos tipos de polimorfismo, 
como es el polimorfismo por sobrecarga, donde se permite crear dos variables con el mismo nombre,
diferenciadas por el tipo de dato que reciben; o el polimorfismo de sustitución,
que permite sustituir un objeto de una clase por otro de una clase hija, sin que el código sufra alteraciones.

Podemos ilustrar el polimorfismo con un ejemplo en Java, donde se crea una clase padre y una clase hija,
y se crea un método que recibe un objeto de la clase padre, pero que puede recibir un objeto de la clase hija.

public class Polimorfismo{
    public static void main(String[] args) {
        //Creamos los objetos
        Vehiculo v1 = new Vehiculo;
        Coche c1 = new Coche;
        //Creamos la secuencia de eventos
        v1.moverse();
        c1.moverse();
    }
}   

class Vehículo{
    public void moverse(){
        System.out.println("El vehículo se mueve");
    }
}

class Coche extends Vehículo{
    public void moverse(){
        System.out.println("El coche se mueve");
    }
}

En este caso, el método moverse() es polimórfico, ya que puede recibir un objeto de la clase padre o de la clase hija,




*/





