package Animais;

public class Passarro extends Animal{
    static int numeroDePassaros;

    public Passarro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }
    @Override
    public void soar() {
        System.out.println("Piu-Piu");

    }
    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    @Override
    public String toString() {
        return "Passarro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {


    }
}
