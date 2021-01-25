package chat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

public class ChatServerRunnable implements Runnable{
    private JTextArea txa;

    public ChatServerRunnable(JTextArea txa) {
        this.txa = txa;
    }

    @Override
    public void run() {
        try (ServerSocket ss=new ServerSocket(8000)){
            while(true){
                try (
                        Socket so=ss.accept();
                        BufferedReader in=new BufferedReader(
                                new InputStreamReader(so.getInputStream()));
                ){
                    String ip=so.getInetAddress().getHostAddress();
                    String nombre="";
                    for(String key:MapaDirecciones.getMapa().keySet()){
                        if(MapaDirecciones.getMapa().get(key).equals(ip)){
                            nombre=key;
                        }
                    }
                    String mensaje=in.readLine();
                    txa.append(nombre+": "+mensaje+"\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
