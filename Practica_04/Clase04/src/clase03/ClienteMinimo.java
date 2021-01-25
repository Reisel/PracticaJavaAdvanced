package clase03;
import java.io.InputStream;
import java.net.Socket;
public class ClienteMinimo {
    public static void main(String[] args) {
        
        System.out.println(System.getProperty("java.version"));
        
        int car;
        try (
                Socket so=new Socket("localhost",5000);
                InputStream in=so.getInputStream();
            ){
          
            //while((car=in.read())!=-1){
            //    System.out.print((char)car);
            //}
            
            //jdk 9
            //byte[] bytes=in.readAllBytes();
            //for(byte b:bytes) System.out.print((char)b);
            
            for(byte b:in.readAllBytes()) System.out.print((char)b);
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}