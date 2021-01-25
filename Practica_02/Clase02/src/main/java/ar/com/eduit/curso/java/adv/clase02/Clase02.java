package ar.com.eduit.curso.java.adv.clase02;
public class Clase02 {
    public static void main(String[] args) {
        /*
        Ciclo de vida de un Thread
        
        NEW             RUNNABLE    TIMEWAITING     BLOCKED IO      TERMINATED
        
        new Thread()    .start()    .suspend()                      .stop()
                                    .sleep()
                                    .wait()
        
        */
        
        HiloT hiloT1=new HiloT("hiloT1");
        HiloT hiloT2=new HiloT("hiloT2",800);
        HiloT hiloT3=new HiloT("hiloT3",600);
        HiloT hiloT4=new HiloT("hiloT4",400);
        
        System.out.println(hiloT1.getState());
        
        hiloT4.setPriority(Thread.MAX_PRIORITY);
        hiloT1.setPriority(Thread.MIN_PRIORITY);
        hiloT2.setPriority(Thread.NORM_PRIORITY);
        hiloT3.setPriority(Thread.NORM_PRIORITY);
        
        try{
        
            //método join
            
            hiloT1.start();
            //hiloT1.join();
            hiloT2.start();
            //hiloT2.join();
            hiloT3.start();
            //hiloT3.join();
            hiloT4.start();
            //hiloT4.join();
            
            System.out.println(hiloT1.getState());
            
            hiloT1.join();
            hiloT2.join();
            hiloT3.join();
            hiloT4.join();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        //try { Thread.sleep(11000); } catch(Exception e) {}
        System.out.println("-- Fin del programa --");
        System.out.println(hiloT1.getState());
        
        
        //Metodo yield()
        
        /*
        
        JAVA        Windows         Linux X86/amd64/arm         Solaris         mac
        
        1           10              -50                         -20             0
        
        
        5           50              0                           0               50
        
        
        10          100             50                          20              100
        
        
        
        
        */
        
        
        
        
    }
}
