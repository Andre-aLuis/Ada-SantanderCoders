package Animais;

public class Cachorro extends Animal{
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }
    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void comer() {

    }

    @Override
    public void soar() {
        System.out.println("Au-Au");

    }

    @Override
    public void dormir() {


    }
}
