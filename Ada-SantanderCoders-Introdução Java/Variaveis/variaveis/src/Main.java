import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe seu nome: ");
        String nome = scan.next();

        System.out.println("Hello "+nome+"!");

        nome = "André Luis da Silveira";
        System.out.println("Hello "+nome+"!");

        int num1;
        int num2 = 6;
        num1 = 10;
        int soma = num1 + num2;
        float divisao = (float) num1/num2;

        System.out.println("A soma de Num1 mais Num2 é: "+soma);
        System.out.println("A divisão de Num1 por Num2 é: "+divisao);
    }
}