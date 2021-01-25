package clase03;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMinimo {
    public static void main(String[] args) {
//        String mensaje="<h1>Servidor de Carlos!</h1>";
//        String mensaje=System.getProperties()+"\n"+System.getenv();
//        mensaje=    "HTTP/1.1 200 OK\n"+
//                    "Content-Length: "+mensaje.length()+"\n\n"
//                    +mensaje;
        
        String mensaje="";
        mensaje+="Lunes.\n";
        mensaje+="Martes.\n";
        mensaje+="Miércoles.\n";
        mensaje+="Jueves.\n";
        mensaje+="Viernes.\n";
        mensaje+="Sábado.\n";
        mensaje+="Domingo.\n";
        mensaje+="Primavera.\n";
        mensaje+="Verano.\n";
        mensaje+="Otoño.\n";
        mensaje+="Invierno.\n";
        mensaje+="Lunes.\n";
        mensaje+="Lunes.\n";
        mensaje+="Lunes.\n";
        
        try (ServerSocket ss=new ServerSocket(5000)) { //try with resources jdk 7 o sup
            while(true){
                System.out.println("Esperando conexión de cliente....");
                try (
                        Socket so=ss.accept();
                        OutputStream out=so.getOutputStream();
                ){
                    System.out.println("Se conecto: "+so.getInetAddress());
                    out.write(mensaje.getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
