package ar.com.eduit.curso.java.adv.clase02;
public class Empleador extends Thread{
    Cuenta cuenta;

    public Empleador(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    @Override
    public void run(){
        cuenta.depositar(20000);
    }
}
