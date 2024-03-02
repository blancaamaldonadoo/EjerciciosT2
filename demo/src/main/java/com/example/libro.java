
public class libro{

    private String titulo;
    private String autor;
    private int paginas;
    private boolean leer;

    public libro(String tirulo, String autor, int paginas, boolean leer){
        this.titulo=titulo;
        this.autor=autor;
        this.paginas=paginas;
        this.leer=leer;
    }

    public void leerLibro(lampara Lampara){
        if(leer==true){
        System.out.println("Estás leyendo el libro "+titulo+" de "+autor);
        lampara.encenderLampara();//encender lámpara uando se quiera leer
        }
        else{
            System.out.println("No estás leyendo el libro");
        }
    }

    protected void finalize() throws Throwable{
        System.out.println("Objeto destruido");
    }

}