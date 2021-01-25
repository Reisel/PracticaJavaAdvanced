package ar.com.eduit.curso.java.adv.clase02;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta=new Cuenta();
        
        Cliente cliente1=new Cliente(cuenta);
        Cliente cliente2=new Cliente(cuenta);
        Empleador empleador=new Empleador(cuenta);
        
        cliente1.start();
        cliente2.start();
        try{ Thread.sleep(3000); }catch(Exception e){}
        empleador.start();
        
        try{ Thread.sleep(1000); }catch(Exception e){}
        System.out.println(cuenta.getSaldo());
        
        /*
        
        Que diferencia hay entre HashMap y Hashtable?
        
        HashMap:
        - No es safe Thread.
        - los métodos no son synchronizados.
        - es más veloz
        
        Hashtable:
        - Es safe Thread.
        - los métodos son synchronizado.
        - es lenta.
        - es legacy y obsoleta.
        
        
        Clase Collections  JDK 7
        (tienen muchas utilidades estaticas para trabajar con collecciones)
        - puede factorizar cualquier collection con métodos parcialmente sinchronizados
        
        
        */
        
        Map<String,String>mapa1=new HashMap();
        mapa1.put("lu", "lunes");
        mapa1.put("ma", "martes");
        mapa1.put("mi", "miércoles");
        mapa1.put("ju", "jueves");
        mapa1.put("vi", "viernes");
        mapa1.forEach((k,v)->System.out.println(v));
        
        System.out.println("*************************************************");
        
        Map<String,String>mapa2=new Hashtable();
        mapa2.put("lu", "lunes");
        mapa2.put("ma", "martes");
        mapa2.put("mi", "miércoles");
        mapa2.put("ju", "jueves");
        mapa2.put("vi", "viernes");
        mapa2.forEach((k,v)->System.out.println(v));
        
        System.out.println("*************************************************");
        
        Map<String,String>mapa3=Collections.synchronizedMap(new HashMap<String,String>());
        mapa3.put("lu", "lunes");
        mapa3.put("ma", "martes");
        mapa3.put("mi", "miércoles");
        mapa3.put("ju", "jueves");
        mapa3.put("vi", "viernes");
        mapa3.forEach((k,v)->System.out.println(v));
    }
}
