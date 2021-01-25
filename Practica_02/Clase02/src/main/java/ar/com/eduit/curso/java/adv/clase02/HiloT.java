package ar.com.eduit.curso.java.adv.clase02;
public class HiloT extends Thread{
    private String nombre;
    private int time=1000;

    public HiloT(String nombre) {
        this.nombre = nombre;
    }
    
    public HiloT(String nombre, int time){
        this.nombre = nombre;
        this.time = time;
    }
    
    @Override
    public void run(){
        for(int a=1;a<=10;a++){
            System.out.println(nombre+" "+a);
            yield();
            try { Thread.sleep(time); } catch(Exception e) {}
        }
    }
}
