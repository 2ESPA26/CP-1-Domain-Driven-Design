package br.com.fiap;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora de volume:");
        System.out.println("Digite a altura:");
        int altura = scan.nextInt();
        System.out.println("Digite o comprimento:");
        int comprimento = scan.nextInt();
        System.out.println("Digite a largura:");
        int largura = scan.nextInt();
        calcularVolume(altura, comprimento, largura);
    }

    public static void calcularVolume(int altura, int comprimento, int largura) {
        int volume = altura * comprimento * largura;
        System.out.println("O volume da caixa é: " + volume);
    }
}