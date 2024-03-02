
public class reloj{

    private String material;
    private boolean alarma;

    public reloj(String material, boolean alarma){
        this.material=material;
        this.alarma=alarma;
    }

    public void sonarAlarma(Lampara lampara){
        if (alarma==true){
            System.out.println("¡Ring!");
            lampara.encenderLampara(); //Método que enciende la lámpara cuando suena el reloj
        }
        else{
            System.out.println("El reloj no tiene alarma");
        }
    }

    protected void finalize() throws Throwable{
        System.out.println("Objeto destruido");
    }


}