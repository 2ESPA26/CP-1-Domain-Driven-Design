package br.com.fiap;
import java.util.Scanner;


public class ex08 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        int peso = 0;
        float altura = 0;

        System.out.println("Calculadora de IMC:");
        System.out.println("Digite o seu peso:");
        peso = scan.nextInt();

        System.out.println("Digite sua altura:");
        altura = scan.nextFloat();

        float imc = peso/(altura*altura);

        if( imc < 18.5){
            System.out.println("Abaixo do peso!");
        } else if (imc >=18.5 && imc <=24.9){
            System.out.println("Peso normal!");
        } else if (imc >= 25 && imc <=29.9){
            System.out.println("Obesidade!");
        }else if(imc >=30){
            System.out.println("Morrreu");
        }

    }
}
