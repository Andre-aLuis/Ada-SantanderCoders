import Animais.Cachorro;
import Animais.Gato;
import Animais.Passarro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro  = new Cachorro("Trovao", "Caramelo", 5.5);
        Gato gato = new Gato("Mimi", "Parda", 2.5);
        Passarro passaro = new Passarro("Flick", "Amarelo", .250);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro);
        System.out.println(cachorro.getEstadoDeEspirito());

        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());

        petshop.tosar(cachorro);
        System.out.println(cachorro.getEstadoDeEspirito());

        petshop.hospedar(passaro);
        System.out.println(passaro.getEstadoDeEspirito());
    }
}