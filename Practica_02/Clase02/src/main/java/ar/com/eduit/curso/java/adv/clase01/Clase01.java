package ar.com.eduit.curso.java.adv.clase01;
public class Clase01 {
    public static void main(String[] args) {
        /*
        Curso: Java Advanced    15 hs.
        Días: Sábados 15:00 a 18:00 hs
        Profe: Carlos Ríos  carlos.rios@educacionit.com
        
        Materiales: alumni.educacionit
        Github:     https://github.com/crios2020/javaADVSadaboOctubre
        
        JDK:    JDK 8.X     JDK 11.X
        
        IDE:    Netbeans, STS, Eclipse, Intellij
        
        */

        
        /*
        
        Tarea 1:    leer file 1 en medio 1                      10 s
        Tarea 2:    leer file 2 en medio 2                      10 s
        Tarea 3:    abrir form y mostrar file 1 y file 2         1 s
        
         Tarea 1    Tarea 2    Tarea 3
        |----------|----------|-|
            10 s      10 s     1 s
        Total: 21s
        
        
         Tarea 1
        |----------|
           10 s
        
         Tarea 2
        |----------|
           10 s
        
                     Tarea 3
                    |-|
                     1 s
        Total: 11s

        
          Tarea 1
        |----------|
           10 s
        
         Tarea 2
        |----------|
           10 s
        
         Tarea 3
        |-|
         1 s
        Total: 10s
       
        */
        
        System.out.println(System.getProperty("java.version"));
        System.out.println("Cantidad de procesadores: "
                +Runtime.getRuntime().availableProcessors());
        
        
        //Clase Thread
        HiloT hiloT1=new HiloT("hiloT1");
        HiloT hiloT2=new HiloT("hiloT2");
        HiloT hiloT3=new HiloT("hiloT3");
        HiloT hiloT4=new HiloT("hiloT4");
        
        
        //método run()
        //invocar directamente el método run(), no habre un nuevo hilo.
        //hiloT1.run();
        //hiloT2.run();
        //hiloT3.run();
        //hiloT4.run();
        
        //método start()
        //Este método ejecuta el método run() en un nuevo hilos.
        //hiloT1.start();
        //hiloT2.start();
        //hiloT3.start();
        //hiloT4.start();
        //hilo anonimo
        //new HiloT("hiloT5").start();
        
        //Interface Runnable
        HiloR hiloR1=new HiloR("hiloR1");
        HiloR hiloR2=new HiloR("hiloR2");
        HiloR hiloR3=new HiloR("hiloR3");
        HiloR hiloR4=new HiloR("hiloR4");
        HiloR hiloR6=new HiloR("hiloR6");
        
        Thread t1=new Thread(hiloR1);
        Thread t2=new Thread(hiloR2);
        Thread t3=new Thread(hiloR3);
        Thread t4=new Thread(hiloR4);
        Thread t5=new Thread(new HiloR("hiloR5"));  //el runnable es anonimo
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        new Thread(hiloR6).start();     //el Thread es anonimo
        new Thread(new HiloR("hiloR7")).start();  //runnable y Thread anonimos 
        
    }
}