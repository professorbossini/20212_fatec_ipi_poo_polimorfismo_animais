public class TesteVariaveisPolimorfiscas2 {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Animal a1 = new Gato();
        Animal a2 = new Cachorro();

        gato.fazerBarulho();
        cachorro.fazerBarulho();
        a1.fazerBarulho();
        a2.fazerBarulho(); 
    }
}
