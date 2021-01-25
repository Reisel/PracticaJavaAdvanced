package ar.com.eduit.curso.java.adv.clase01;

import java.text.DecimalFormat;
import java.time.LocalTime;
import javax.swing.JTextField;

public class HoraR implements Runnable {

    private JTextField txt;

    public HoraR(JTextField txt) {
        this.txt = txt;
    }
    
    @Override
    public void run() {
        while(true){
            LocalTime lt=LocalTime.now();
            int hora=lt.getHour();
            int minuto=lt.getMinute();
            int segundo=lt.getSecond();
            DecimalFormat df=new DecimalFormat("00");
            txt.setText(df.format(hora)+":"+df.format(minuto)+":"+df.format(segundo));
            try { Thread.sleep(1000); } catch(Exception e) {}
        }
    }
    
}
