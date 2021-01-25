package ar.com.eduit.curso.java.adv.clase02;

public class Empleado extends Thread{
    private String nombre;
    private boolean esJefe;
    private Saludo saludo;

    public Empleado(String nombre, boolean esJefe, Saludo saludo) {
        this.nombre = nombre;
        this.esJefe = esJefe;
        this.saludo = saludo;
    }
    
    @Override
    public void run(){
        saludo.saludar(nombre, esJefe);
    }
}
