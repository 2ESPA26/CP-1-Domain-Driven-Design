package br.com.fiap;
import java.util.Scanner;


public class ex05 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[10];


        for(int x=0; x<10; x++){
            System.out.println("Digite o " + (x+1) + "° número:");
            nums[x] = scan.nextInt();
        }

        int[] numsPares = new int[10];
        int contadorPar = 0;

        int[] numsImpares = new int[10];
        int contadorImpar =0;

        for(int y=0; y < nums.length; y++){

            if(nums[y] %2 ==0){
                numsPares[contadorPar] = nums[y];
                contadorPar++;
            }
            else{
                numsImpares[contadorImpar] = nums[y];
                contadorImpar++;
            }
        }
        System.out.println("Você tem um total de " + contadorPar + " números pares e " + contadorImpar + " de impares!");
        System.out.println("Que são eles:");
        System.out.printf("Pares: ");
        for(int x=0; x<contadorPar; x++){

            System.out.print(numsPares[x]);
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("Impares: ");
        for(int x=0; x<contadorImpar; x++){
            System.out.print(numsImpares[x]);
            System.out.print("-");
        }
    }
}
