package ar.com.eduit.curso.java.adv.clase01;
public class HiloR implements Runnable{
    private String nombre;

    public HiloR(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for(int a=1;a<=10;a++){
            System.out.println(nombre+" "+a);
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }  
}