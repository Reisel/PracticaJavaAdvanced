package serializable;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializado {
    public static void main(String[] args) {
        File file=new File("personas.dat");
        
        //Serializado
        try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));){
            out.writeObject(new Persona("Laura","Gomez",26));
            out.writeObject(new Persona("Jose","Perez",28));
            out.writeObject(new Persona("Sabrina","Riera",38));
            out.writeObject(new Persona("Santiago","Romero",24));
            out.writeObject(new Persona("Carlos","Ríos",47));
            out.writeObject(new Persona("Debora","Vargas",43));
            out.writeObject(new Persona("Lautaro","Vargas",43));
            out.writeObject(new Persona("Aurora","Vargas",43));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //DeSerializado
        List<Persona>list=new ArrayList();
        try (ObjectInputStream in=new ObjectInputStream(new FileInputStream(file))){
            while(true){
                Persona p=(Persona)in.readObject();
                //System.out.println(p);
                list.add(p);
            }
        } catch(EOFException e){ System.out.println("Fin de Archivo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        //Recorrido de lista con indices
        //for(int a=0;a<list.size();a++) System.out.println(list.get(a));
        
        //Recorrido forEach  JDK 5 o superior
        //for(Persona p:list) System.out.println(p);
        
        
        //select * from personas;
        //Método .forEach();
        //list.forEach(p->System.out.println(p));
        //list.forEach(System.out::println);
        
        
        //select * from personas where edad>=30;
        /*
        for(Persona p:list){
            if(p.getEdad()>=30){
                System.out.println(p);
            }
        }
        */
        
        //list.stream().filter(p->p.getEdad()>=30).forEach(System.out::println);
        
        // select * from personas where where nombre='Laura';
        //list
        //        .stream()
        //        .filter(p->p.getNombre().equalsIgnoreCase("laura"))
        //        .forEach(System.out::println);
        
        
        // select * from personas where nombre like '%au%';
        list
                .stream()
                .filter(p->p.getNombre().toLowerCase().contains("au"))
                .forEach(System.out::println);
        
        // and or
        //comparable
        //sorted
        //max min
        //
                
    }
}