import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class TestePolimorfismoColecao {

    public static void main(String[] args) {
        //programe voltado a uma interface e não a uma implementação
        List <Animal> animais = new LinkedList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new BemTeVi());
        animais.add(new Gato());

        for (Animal animal: animais){
            //chamando o método fazerBarulho sobre o objeto
            //enviando a mensagem fazerBarulho ao objeto
            animal.fazerBarulho();
        }

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        ordenar(arrayList);
        ordenar(linkedList);

    }

    public static void ordenar (List <Integer> a){
    
    }
    
}
