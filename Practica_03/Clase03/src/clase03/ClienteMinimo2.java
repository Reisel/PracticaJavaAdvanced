package clase03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Comparator;

public class ClienteMinimo2 {
    public static void main(String[] args) {
        String line;
        try (
            BufferedReader in=new BufferedReader(
                new InputStreamReader(
                        new Socket("localhost",5000).getInputStream()))){
            
            //while((line=in.readLine())!=null){
            //    System.out.println(line);
            //}
            
            //in.lines().forEach(l->System.out.println(l));
            //in.lines().forEach(System.out::println);
            
            //listar elementos que terminen en es.
            //in.lines().filter(l->l.endsWith("es.")).forEach(System.out::println);
            
            //lista elementos que contengan letra l
            //in
            //        .lines()
            //        .filter(l->l.toLowerCase().contains("l"))
            //        .forEach(System.out::println);
            
            //listar elementos ordenados alfabeticamente
            //in.lines().sorted().forEach(System.out::println);
            in
                    .lines()
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
