package br.com.fiap;
import java.util.Scanner;


public class ex06 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.println("Calculadora de tabuada:");
        System.out.println("Digite o número:");
        num = scan.nextInt();

        calculadoraTabuada(num);

    }
    public static int calculadoraTabuada(int numero){
        int contador = 1;
        while(contador < 11){
            System.out.println(contador + "x" + numero + "= " + contador*numero);
            contador++;
        }


        return numero;
    }

}
