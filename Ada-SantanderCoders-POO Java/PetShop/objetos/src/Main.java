import Animais.Animal;
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
        cachorro.soar();
        petshop.darBanho(cachorro);
        System.out.println(cachorro.getEstadoDeEspirito());

        //comentário de uma linha
        gato.soar();
        petshop.darBanho(gato);
        System.out.println(gato.getEstadoDeEspirito());
        /*comentário de várias linhas
          com esse comentamos várias linhas
         */
        petshop.tosar(cachorro);
        System.out.println(cachorro.getEstadoDeEspirito());

        passaro.soar();
        petshop.hospedar(passaro);
        System.out.println(passaro.getEstadoDeEspirito());
    }
}