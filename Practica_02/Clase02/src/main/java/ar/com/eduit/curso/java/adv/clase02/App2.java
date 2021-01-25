package ar.com.eduit.curso.java.adv.clase02;
public class App2 {
    public static void main(String[] args) {
        Saludo saludo=new Saludo();
        
        new Empleado("juan", false, saludo).start();
        new Empleado("laura", false, saludo).start();
        new Empleado("maria", false, saludo).start();
        new Empleado("javier", false, saludo).start();
        
        try {Thread.sleep(100);} catch(Exception e){}
        new Empleado("jefe", true, saludo).start();
    }
}
