public class TesteVariaveisPolimorficas {
    public static void main(String[] args) {
        // Animal a1 = new Gato();
        // Animal a2 = new Cachorro();
        // a1.fazerBarulho();
        // a2.fazerBarulho();
        Animal a1 = new Gato();
        a1.fazerBarulho();
        a1 = new Cachorro();
        a1.fazerBarulho();
       
    }
}
