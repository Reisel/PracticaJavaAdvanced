package chat;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaDirecciones {
    public static Map<String,String>getMapa(){
        Map<String,String> map=new LinkedHashMap();
        map.put("Carlos", "192.168.0.3");
        map.put("Marcos", "192.168.0.5");
        map.put("Laura",  "192.168.0.6");
        map.put("Patricio",  "192.168.0.3");
        return map;
    }
}
