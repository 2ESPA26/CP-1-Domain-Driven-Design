package br.com.fiap;
import java.util.Scanner;


public class ex02 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Verificador de idade:");
        System.out.println();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        if(idade >= 16){
            System.out.println("Você pode votar, sua idade: "+ (idade));
        }
        else{
            System.out.println("Você não pode votar, sua idade: " + (idade) + ". A idade miníma para voto é de 16 anos");
        }

    }
}
