package ar.com.eduit.curso.java.adv.clase02;
public class Saludo {
    public synchronized void saludar(String nombre,boolean esJefe){
        if(esJefe){
            System.out.println("Hola Llegue!!!");
            
            notify();
            try{ Thread.sleep(10); }catch(Exception e){}
            
            notify();
            try{ Thread.sleep(10); }catch(Exception e){}
            
            notify();
            try{ Thread.sleep(10); }catch(Exception e){}
            
            notifyAll();
        }else{
            System.out.println("llego "+nombre);
            try{ wait(); }catch(Exception e){}
            System.out.println(nombre+": hola Jefe!");
        }
    }
}
