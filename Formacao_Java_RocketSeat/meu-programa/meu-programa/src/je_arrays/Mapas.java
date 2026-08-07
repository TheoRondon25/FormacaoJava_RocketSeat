package je_arrays;

import java.util.*;

public class Mapas {
    public static void main(String[] args) {
        //Map <String, String> estados = new HashMap();
        //Map <String, String> estados = new LinkedHashMap();
        Map <String, String> estados = new TreeMap();
        estados.put("PI", "Piaui");
        estados.put("MA", "Maranhao");
        estados.put("CE", "Ceara");
        System.out.println("O estado que esta na chave PI é " + estados.get("PI"));

        Iterator <String> keys= estados.keySet().iterator();

        while(keys.hasNext()){
            String chave = keys.next();
            String valor = estados.get(chave);

            System.out.println("O estado é " + valor);
        }

    }
}
