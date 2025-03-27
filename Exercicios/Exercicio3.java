package Exercicios;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double raio = 0;

        System.out.println("Digite o raio");
        raio = scn.nextDouble();

        System.out.println("O valor da área do circulo é " + 3.14 * raio * raio);
        scn.close();
    }
}
