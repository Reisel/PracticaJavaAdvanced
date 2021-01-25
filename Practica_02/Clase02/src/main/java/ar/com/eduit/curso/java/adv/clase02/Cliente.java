package ar.com.eduit.curso.java.adv.clase02;
public class Cliente extends Thread{
    private Cuenta cuenta;

    public Cliente(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    @Override
    public void run(){
        cuenta.debitar(2000);
    }
}
