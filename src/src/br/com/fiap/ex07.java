package br.com.fiap;
import java.util.Scanner;


public class ex07 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
       int[] nuns = new int[2];
        System.out.println("Verificador de número:");

        for(int x=0; x<2; x++){
            System.out.println("Digite o "+ (x+1) + "° número:");
            int num = scan.nextInt();
            nuns[x] = num;
        }

        calculadoraFatorial(nuns);

    }
    public static void calculadoraFatorial(int[] numeros){
        int maior =0;
        int menor =0;

        if(numeros[0] >numeros[1]){
            maior = numeros[0];
            menor = numeros[1];
        }
        else{
            maior = numeros[1];
            menor = numeros[0];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }

}
