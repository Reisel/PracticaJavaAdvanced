package clase05;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Clase05 {
    public static void main(String[] args) {
        // Clase 05 
        System.out.println("Clase 05");
        
       
        // Stream
        // and or
        //sorted
        //max min
        //hashCode() .equals()
        //Comparable
        
        
        //Persona p=new Persona("Silvio","Hebve",42);
        
        System.out.println(Dias.JUEVES);
        System.out.println(Estaciones.INVIERNO);
        
        
        Cita cita=new Cita("Adrian",Dias.MARTES,Turno.NOCHE);
        
        System.out.println("*************************************************");
        PersonaRepository pr=new PersonaRepository();
        pr.add(new Persona("Juan","Perez",20));
        pr.add(new Persona("Ana","Sosa",30));
        pr.add(new Persona("Laura","Lopez",40));
        pr.add(new Persona("Mariela","Perez",22));
        pr.add(new Persona("Monica","Sosa",33));
        pr.add(new Persona("Sergio","Lopez",44));
        pr.add(new Persona("Lucas","Perez",55));
        pr.add(new Persona("Tomas","Lopez",40));
        pr.add(new Persona("Diego","Sosa",50));
        pr.add(new Persona("Ana","Lopez",33));
        pr.add(new Persona("Anabella","Perez",47));
        pr.add(new Persona("Cecilia","Sosa",21));
        pr.add(new Persona("Cecilio","Perez",32));
        pr.add(new Persona("Carlos","Sosa",65));
        pr.add(new Persona("Patricio","Perez",19));
        pr.add(new Persona("Aurora","Perez",19));
        pr.add(new Persona("Lautaro","Perez",19));
        
        
        //select * from personas;
        //Método .forEach();
        //list.forEach(p->System.out.println(p));
        //pr.getAll().forEach(System.out::println);
        
        
        //select * from personas where edad>=30;        
        //pr.getAll().stream().filter(p->p.getEdad()>=30).forEach(System.out::println);
        
        // select * from personas where where nombre='Laura';
        //pr.getAll()
        //        .stream()
        //        .filter(p->p.getNombre().equalsIgnoreCase("laura"))
        //        .forEach(System.out::println);
        
        
        // select * from personas where nombre like '%au%';
        //pr.getAll()
        //        .stream()
        //        .filter(p->p.getNombre().toLowerCase().contains("au"))
        //        .forEach(System.out::println);
      
        // select * from personas where nombre like '%au%' and apellido='Perez';
        //pr.getAll()
        //        .stream()
        //        .filter(p->p.getNombre().toLowerCase().contains("au")
        //                && p.getApellido().equalsIgnoreCase("perez"))
        //        .forEach(System.out::println);
        
        // select * from personas where edad between 30 and 40;
        //pr.getAll()
        //        .stream()
        //        .filter(p->p.getEdad()>=30 && p.getEdad()<=40)
        //        .forEach(System.out::println);
        
        // select max(edad) from personas;
        int edad=pr.getAll()
                .stream()
                .max(Comparator.comparingInt(Persona::getEdad))
                .get()
                .getEdad();
        System.out.println(edad);
        
        // select * form personas where edad=(select max(edad) from personas);
        pr.getAll()
                .stream()
                .filter(p->p.getEdad()==edad)
                .forEach(System.out::println);
        
        System.out.println("*************************************************");
        Persona p1=new Persona("Ruben","Dario",34);
        Persona p2=p1;
        Persona p3=new Persona("Ruben","Dario",34);
        Persona p4=new Persona(p1.getNombre(),p1.getApellido(),p1.getEdad());
        Persona p5=new Persona("Ariel","Torres",31);
        String  p6="Juan";
        
        //p2.setNombre("Juana");
        //System.out.println(p1);
        //System.out.println(p3);
        
        System.out.println("p1.hashCode()="+p1.hashCode());
        System.out.println("p2.hashCode()="+p2.hashCode());
        System.out.println("p3.hashCode()="+p3.hashCode());
        System.out.println("p4.hashCode()="+p4.hashCode());
        System.out.println("p5.hashCode()="+p5.hashCode());
        System.out.println("p6.hashCode()="+p6.hashCode());
        
        System.out.println("p1.equals(p1)="+p1.equals(p1));
        System.out.println("p1.equals(p2)="+p1.equals(p2));
        System.out.println("p1.equals(p3)="+p1.equals(p3));
        System.out.println("p1.equals(p4)="+p1.equals(p4));
        System.out.println("p1.equals(p5)="+p1.equals(p5));
        System.out.println("p1.equals(p6)="+p1.equals(p6));
       
        //pr.remove(new Persona("Ana","Lopez",33));
        //pr.getAll().forEach(System.out::println);
        System.out.println("*************************************************");
        
        //Set<Persona>set=new TreeSet();
        //set.addAll(pr.getAll());
        //set.forEach(System.out::println);
        
        //select * from personas order by nombre;
        pr.getAll().stream().sorted().forEach(System.out::println);
        //pr.getAll().stream()
        //        .sorted(Comparator.comparing(Persona::getNombre))
        //        .forEach(System.out::println);
        
        
    }
    
}
