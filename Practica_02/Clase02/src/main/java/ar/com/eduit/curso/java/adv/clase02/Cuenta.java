package ar.com.eduit.curso.java.adv.clase02;
public class Cuenta {
    private float saldo=2000;
    
    public void debitar(float monto){
        System.out.println("-- iniciando operación debito --");
        synchronized(this){  //Sincronizado parcial JDK 7
            if(saldo>=monto){
                try{ Thread.sleep(2000); }catch(Exception e){}
                saldo-=monto;
            }else{
                System.out.println("No hay fondos suficientes!");
            }
        }
        System.out.println("-- operación debito terminada --");
    }

    public synchronized void depositar(float monto){
        saldo+=monto;
    }
    public synchronized float getSaldo(){
        return saldo;
    }
}