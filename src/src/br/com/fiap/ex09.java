package br.com.fiap;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] nums = new int[3];
        for(int x = 0; x<3; x++){
            System.out.println("Calculadora de média");
            System.out.println("Digite o " + (x+1) + "° número: ");
            nums[x] = scan.nextInt();
        }
        calcularMedia(nums);
    }
    public static void calcularMedia(int[] nums){
        int soma = 0;
        for(int x = 0; x<3; x++){
            soma += nums[x];

        }
        float media = (float) soma/3;
        System.out.printf("Média aritmética é igual a %.2f%n", media);
    }
}
