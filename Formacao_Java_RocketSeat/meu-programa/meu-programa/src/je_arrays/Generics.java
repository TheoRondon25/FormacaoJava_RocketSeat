package je_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List <String> prateleira = new ArrayList();
        prateleira.add("Carrinho 1");
        prateleira.add("Carrinho 2");
        //prateleira.add(1); -> nesse caso nao pode porque especificamos que é uma lista de string

        for (String carrinho : prateleira){
            System.out.println(carrinho);
        }

        // COLLECTIONS
        System.out.println("---collections---");
        List<String> prateleira2 = new ArrayList();
        prateleira2.add("jeep");
        prateleira2.add("ford ka");
        prateleira2.add("gol 2000");
        prateleira2.add("fiesta");

        //Collections.sort(prateleira2); // ordem alfabetica
        //Collections.reverse(prateleira2); // ordem invertida
        Collections.shuffle(prateleira2); // ordem aleatoria (embaralhado)

        for (String carros : prateleira2) {
            System.out.println(carros);
        }

    }
}
