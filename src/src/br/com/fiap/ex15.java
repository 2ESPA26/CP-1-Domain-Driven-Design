package br.com.fiap;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Contagem regressiva");
        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        contagemRegressiva(numero);
    }

    public static void contagemRegressiva(int numero) {
        for (int x = numero; x >= 0; x--) {
            System.out.println(x);
        }
    }
}