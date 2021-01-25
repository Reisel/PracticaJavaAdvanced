package serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerSerializado {
    public static void main(String[] args) {
        try (ServerSocket ss=new ServerSocket(9000)) {
            while(true){
                System.out.println("Esperando conexión de cliente....");
                try (
                        Socket so=ss.accept();
                        ObjectInputStream in=new ObjectInputStream(so.getInputStream());
                        ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
                ){
                    try{
                        System.out.println("se conecto "+so.getInetAddress());
                        Persona p=(Persona)in.readObject();
                        System.out.println(p);
                        out.writeUTF("Se recibio el objeto!");
                    }catch(Exception e){
                        out.writeUTF("El objeto recibido no pertenece a la clase esperada.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
