package br.com.fiap;
import java.util.Scanner;

public class ex10 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        String metodo;
        float preco = 0;

        System.out.println("Caixa do SuperMercado:");
        System.out.println("Digite o preço do seu produto:");
        preco= scan.nextFloat();

        System.out.println("Digite a forma de pagamento(A vista, Parcelado 2x, Parcelado 4x):");
        scan.nextLine();
        metodo = scan.nextLine();

        if(metodo.equals("A vista")){
            System.out.println("O preço final do produto é de "+ preco);
        }else if (metodo.equals("Parcelado 2x")){
            float preco2x =0;
            preco2x = preco/2;
            System.out.println("O preço final do produto é de duas parcelas de R$" + preco2x + " total R$" + preco2x*2);
        }else{
            float juros = 0.08f;
            float precoFinal =0;
            precoFinal =(preco + (preco*juros))/4;

            System.out.println("O preço final do produto é igual a 4 parcelas de R$" +precoFinal + " total R$" +precoFinal*4);
        }
    }
}
