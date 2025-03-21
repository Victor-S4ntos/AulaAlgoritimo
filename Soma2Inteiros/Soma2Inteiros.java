import java.util.Scanner;

public class Soma2Inteiros{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int valor1 = 0;
        int valor2 = 0;
        int resultado1 = 0;
        int valor3 = 0;
        int valor4 = 0;
        int resultado2 = 0;
        int resultadoFinal = 0;


        while (true) {
            System.out.println("Não deixar conta logada na porra do pc da faculdadeeee");
        }
        
        
        System.out.println("Digite o primeiro valor");
        valor1 = scn.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = scn.nextInt();
        resultado1 = valor1 + valor2;

        //Não deixar conta logada na porra do pc da faculdadeeee
        //Não deixar conta logada na porra do pc da faculdadeeee
        //Não deixar conta logada na porra do pc da faculdadeeee

        System.out.println("Digite o terceiro valor");
        valor3 = scn.nextInt();
        System.out.println("Dugute o quarto valor");
        valor4 = scn.nextInt();
        resultado2 = valor3 + valor4;

        resultadoFinal = resultado1 + resultado2;
        System.out.println("resultado: " + resultadoFinal);
    }
}
