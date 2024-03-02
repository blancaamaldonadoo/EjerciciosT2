package com.example;


public class reloj{

    private String material;
    private static boolean alarma;

    public reloj(String material, boolean alarma){
        this.material=material;
        reloj.alarma=alarma;
    }

    public static void sonarAlarma(lampara lampara){
        if (alarma==true){
            System.out.println("¡Ring!");
            com.example.lampara.encenderLampara(); //Método que enciende la lámpara cuando suena el reloj
        }
        else{
            System.out.println("El reloj no tiene alarma");
        }
    }
    public void apagarAlarma(libro libro){
        if (alarma==true){
            System.out.println("Alarma apagada");
            
        }
        else{
            System.out.println("El reloj no tiene alarma");
        }
    }
    protected void finalize() throws Throwable{
        System.out.println("Objeto destruido");
    }


}