package serializable;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteSerializado {
    public static void main(String[] args) {
        try(
            Socket so=new Socket("localhost",9000);
            ObjectOutputStream out=new ObjectOutputStream(so.getOutputStream());
            ObjectInputStream in=new ObjectInputStream(so.getInputStream());
        ) {
            out.writeObject(new Persona("Carlos","Ríos",47));
            System.out.println(in.readUTF());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
