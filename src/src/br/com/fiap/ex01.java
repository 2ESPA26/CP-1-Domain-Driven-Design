package br.com.fiap;
import java.util.Scanner;


public class ex01 {
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Conversor de unidade de medida");
    System.out.println();
    System.out.println("Digite a quantidade de metros que deseja converter:");
    float numero = scan.nextFloat();

    float numCen = numero * 100;
    float numMil = numCen *1000;

    System.out.println("O número " + (numero) + "M convertido corresponde a " + (numCen)+ "cm e " + (numMil) + "mm" );
    }
}
