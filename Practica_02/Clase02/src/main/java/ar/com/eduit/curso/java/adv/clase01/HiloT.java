package ar.com.eduit.curso.java.adv.clase01;
public class HiloT extends Thread {
    //Thread: permite ejecutar en un nuevo hilo.
    
    private String nombre;

    public HiloT(String nombre) {
        this.nombre = nombre;
    }
    
    public void hablar(){
        //Este método no puede ejecutar en un nuevo hilo.
    }
    
    @Override
    public void run(){
        //El método run() es el unico que puede ejecutar en un nuevo hilo.
        for(int a=1;a<=10;a++){
            System.out.println(nombre+" "+a);
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
    
}