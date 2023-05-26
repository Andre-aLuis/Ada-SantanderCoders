import Animais.Cachorro;
import Animais.Gato;
import Animais.Passarro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro  = new Cachorro("Trovao", "Caramelo", 5.5);
        Gato gato = new Gato("Mimi", "Parda", 2.5);
        Passarro passaro = new Passarro("Flick", "Amarelo", .250);

        cachorro.soar();
        gato.soar();
        passaro.soar();
//        Cachorro cachorro1 = new Cachorro("Trovão","marrom",25,5.5,12,"neutro" );
//        System.out.println(cachorro1.getNumeroDeCachorros());
//        Cachorro cachorro2 = new Cachorro("Thunder","branca",25,11.5,20,"neutro" );
//        System.out.println(cachorro2.getNumeroDeCachorros());
//
//        cachorro1.comer();
//        cachorro1.latir();
//        System.out.println("O cachorro "+cachorro1.getNome() +" pegou o objeto: "+cachorro1.pegar());
//        System.out.println("o Cachorro está :"+cachorro1.interagir("carinho"));
//        System.out.println("o Cachorro está :"+cachorro1.interagir("nada"));
//        System.out.println("o Cachorro está :"+cachorro1.interagir("pisar"));
//        System.out.println("o Cachorro está :"+cachorro1.interagir("chute"));
//        System.out.println(cachorro1.toString());
//        System.out.println(cachorro2.toString());
    }
}