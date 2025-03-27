import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double base = 0;
        double altura = 0;
        double area = 0;

        System.out.println("Digite a base");
        base = scn.nextDouble();

        System.out.println("Digite a altura");
        altura = scn.nextDouble();

        area = base * altura / 2;

        System.out.println("resultado: " + area);
        scn.close();
    }
}
