package je_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
        linguagens.add("java");
        linguagens.add("C#");
        linguagens.add("javaScript");
        linguagens.add("go");
        linguagens.add(3, "python");
        System.out.println("A Linguagem na posicao 3 é: "+ linguagens.get(3));
        System.out.println("A linguagem Java está na posição: " + linguagens.indexOf("java"));
        System.out.println("Comprimento atual: "+ linguagens.size());

        System.out.println(linguagens.contains("go"));

        for(Object linguagem: linguagens){
            System.out.println(linguagem);
        }
    }
}
