package clase04;

import java.io.File;
import java.io.FileReader;

public class X {
    public static void main(String[] args) {
        try(FileReader in=new FileReader(new File("texto.txt"))){
            System.out.println(in.read());
        }catch(Exception e){

        }finally{

        }
        
    }
}
