package br.com.fiap;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Conversor Fahrenheit para Celsius");
        System.out.println("Digite a temperatura em Fahrenheit:");
        float fahrenheit = scan.nextFloat();
        converterTemperatura(fahrenheit);
    }

    public static void converterTemperatura(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("Temperatura em Celsius: %.2f%n", celsius);
    }
}