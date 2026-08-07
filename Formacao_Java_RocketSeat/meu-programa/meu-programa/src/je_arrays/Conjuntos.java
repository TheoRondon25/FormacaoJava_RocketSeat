package je_arrays;

import java.util.*;

public class Conjuntos {
    public static void main(String[] args) {
        /*
        * Conjuntos são HashSet, LinkedHashSet e TreeSet
        * */

        //Set linguagens = new HashSet();
        //Set linguagens = new LinkedHashSet();
        Set linguagens = new TreeSet();
        linguagens.add("java");
        linguagens.add("C#");
        linguagens.add("javaScript");
        linguagens.add("go");

        System.out.println(linguagens.contains("go"));

        for(Object linguagem: linguagens){
            System.out.println(linguagem);
        }
    }
}
