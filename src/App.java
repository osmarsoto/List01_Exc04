import java.util.Scanner;

public class App {
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    public static void main(String[] args) throws Exception {
        int a, b, c, d, media; 

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        a = sc.nextInt();

        System.out.print("Digite a nota 2: ");
        b = sc.nextInt();

        System.out.print("Digite a nota 3: ");
        c = sc.nextInt();

        System.out.print("Digite a nota 4: ");
        d = sc.nextInt();

        sc.close();

        media = ((a+ b+ c+ d)/4);
        System.out.print("A média é: " + media); 

    }   
}

