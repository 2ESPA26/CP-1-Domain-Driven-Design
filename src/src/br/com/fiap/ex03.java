package br.com.fiap;
import java.util.Scanner;


public class ex03 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Verificador de inteiros:");
        System.out.println();
        int[] nums = new int[2];

        for(int x =0; x<2; x++ ){
            System.out.println("Digite o " + (x+1) + "° número:");
            nums[x] = scan.nextInt();
        }
        while(nums[0]<nums[1]-1){
            nums[0]++;
            System.out.println(nums[0]);

        }
    }
}
