/*EJERCICIO6.2
Diseña e implementa un sistema en el que diferentes clases derivadas de una superclase
común sobrescriban un método específico. Demuestra cómo se pueden manejar objetos de estas clases
 de manera polimórfica a través de una interfaz común, y cómo el comportamiento varía en
  tiempo de ejecución dependiendo del tipo de objeto. */

//Utilizamos una superclase común con varias clases derivadas que sobreescriban un método específico;
// y una interfaz común para manejar objetos de estas clases de manera polimórfica.

public Animal{ //superclase

    public void sonidoAnimal(){
        System.out.println("Sonido de un animal");
    }
}

class Perro extends Animal implements Mascota{ //clase hija 1

    public void sonidoAnimal(){
        System.out.println("Guau guau");
    }

    public void jugar(){
        System.out.println("El perro juega");
    }
}

class Gato extends Animal implements Mascota{ //clase hija 2

    public void sonidoAnimal(){
        System.out.println("Miau miau");
    }

    public void jugar(){
        System.out.println("El gato juega");
    }
}

interface Mascota{ 

    void jugar();
}

public class Main{

    public static void main(String[] args) {
        
        Animal a1 = new Perro;
        Animal a2= new Gato;  //objetos
       
        
        a1.sonidoAnimal();//Llamada a los métodos
        a2.sonidoAnimal();

        Mascota m1= new Perro;
        Mascota m2= new Gato; //objetos de la interfaz

        m1.jugar();
        m2.jugar();
    }
}

/*La clase padre (animal) tiene un método: sonidoAnimal() que es sobreescrito tanto por la clase hija Perro
como por la clase hija Gato. Además, la interfaz Mascota tiene un método jugar() que es implementado por ambas tambien.

Se vuelve a demostrar el polimorfismo en la clase main cuando se hacen llamadas a los métodos de 
la clase padre y tambén a las interfaces.
*/