/*EJERCICIO2.1
Diseño de Clases Avanzado: Elige tres objetos de la lista creada en el ejercicio original 
(por ejemplo, una lámpara, un reloj y un libro). Para cada objeto, define una clase en un 
lenguaje de programación orientado a objetos de tu elección, asegurándote de incorporar atributos privados,
métodos públicos, constructores, y destructores. Además, implementa métodos que demuestren la 
interacción entre estos objetos (como encender la lámpara cuando suena el reloj). 
3. Simulación de Interacción entre Objetos
 */

 public class lampara { //clase Lampara con atributos privados
    private boolean encendida;
    private String tipoLuz;
    private int bombillas;

    public Lampara (boolean encendida, String tipoLuz, int bombillas){ //constructor de la clase
        this.encendida= encendida; //this se refiere a la instancia de la clase (objeto)
        this.tipoLuz=tipoLuz;
        this.bombillas=bombillas; 
    }

    public void encenderLampara(){ //método público que enciende la lámpara
        encendida=true; //cambia el valor de la variable encendida a true
    }

    public void apagarLampara(){ //método público que apaga la lámpara
        encendida=false; //cambia el valor de la variable encendida a false
    }

    //Destructor:

    protected void finalize() throws Throwable{
        System.out.println("Objeto destruido");
    }   

 }

 