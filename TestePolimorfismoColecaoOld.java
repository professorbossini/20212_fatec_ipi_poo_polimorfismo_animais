import java.util.ArrayList;
import java.util.List;

public class TestePolimorfismoColecaoOld {
    public static void main(String[] args) {
        List <AnimalSemPolimorfismo> animais = new ArrayList<>();
        animais.add(new AnimalSemPolimorfismo(3));
        animais.add(new AnimalSemPolimorfismo(1));
        animais.add(new AnimalSemPolimorfismo(2));
        animais.add(new AnimalSemPolimorfismo(1));
        animais.add(new AnimalSemPolimorfismo(1));
        animais.add(new AnimalSemPolimorfismo(3));
        animais.add(new AnimalSemPolimorfismo(1));

        for (AnimalSemPolimorfismo a: animais){
            a.fazerBarulho();
        }

    }
    
}
class AnimalSemPolimorfismo{
    //1: Gato 2: Cachorro 3: Bem-te-vi
    int tipo;

    public AnimalSemPolimorfismo (int tipo){
        this.tipo = tipo;
    }

    //esse trecho de código, especialmente o if/else nos leva a violar um princípio: aberto/fechado
    public void fazerBarulho(){
        if (tipo == 1){
            System.out.println ("miau");
        }
        else if (tipo == 2){
            System.out.println ("au au");
        }
        else if (tipo == 3){
            System.out.println ("Bem-te-vi");
        }
    }
}