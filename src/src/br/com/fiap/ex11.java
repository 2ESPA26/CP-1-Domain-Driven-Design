package br.com.fiap;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Verificador de idade:");
        String[][] pessoas = new String[3][2];

        for (int x =0; x< pessoas.length;x++){

            System.out.println("Digite o nome da " +(x+1) + "° pessoa");
            pessoas[x][0] = scan.nextLine();

            System.out.println("Digite a idade da " + (x + 1) + "° pessoa:");
            pessoas[x][1] = scan.nextLine();
        }
        int velha =0;
        String nomeVelha = "";
        
        for (int x = 0; x < pessoas.length; x++) {

            int idade = Integer.parseInt(pessoas[x][1]);
            if(idade>velha){
                velha = idade;
                nomeVelha = pessoas[x][0];
            }
        }

        System.out.println("A pessoa mais velha é "+ nomeVelha + "que tem "+velha+" anos");


    }
}
