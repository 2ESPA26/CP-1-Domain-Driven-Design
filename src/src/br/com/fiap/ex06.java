package br.com.fiap;
import java.util.Scanner;


public class ex06 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int res;
        int num;

        System.out.println("Calculadora de fatorial:");
        System.out.println();

        System.out.printf("Digite o número que deseja calcular o fatorial:");
        num = scan.nextInt();

        res = calculadoraFatorial(num);

        System.out.println("O fatorial de " + (num) + " é igual a: "+res );

    }
    public static int calculadoraFatorial(int numero){

        int fatorial =1;

        if(numero<0){
            System.out.println("O número não pode ser negativo!");

        }

        for(int i = 1; i<=numero; i++ ){
            fatorial*=i;
        }
        return fatorial;
    }

}
