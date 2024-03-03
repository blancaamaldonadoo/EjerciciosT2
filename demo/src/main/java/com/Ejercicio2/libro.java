package com.example;

    public class libro {
    
        
    private static String titulo;
    private static String autor;
    private int paginas;
    private static boolean leer;

    public libro(String titulo, String autor, int paginas, boolean leer){
        libro.titulo=titulo;
        libro.autor=autor;
        this.paginas=paginas;
        libro.leer=leer;
    }

    public static void leerLibro(lampara Lampara){
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