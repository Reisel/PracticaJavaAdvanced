package ar.com.eduit.curso.java.adv.clase01;

import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CronometroR implements Runnable {
    private JTextField txt;
    private int cont=0;
    private DecimalFormat df=new DecimalFormat("000000");
    private boolean correr=false;

    public CronometroR(JTextField txt) {
        this.txt = txt;
    }
    
    @Override
    public void run() {
       while(true){
           if(correr){
               cont++;
               txt.setText(df.format(cont));
           }
           try { Thread.sleep(1000); } catch(Exception e) {}
       }
    }
    
    public void start(){
        correr=true;
    }
    
    public void pause(){
        correr=false;
    }
    
    public void reset(){
        correr=false;
        cont=0;
        txt.setText(df.format(cont));
    }
    
}