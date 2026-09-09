package br.com.fiap;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args){

        Car carro1 = new Car();

        carro1.brand = "Honda";
        carro1.year = 1992;
        carro1.model = "Accord";

        Car carro2 = new Car();

        carro2.brand = "Toyota";
        carro2.year = 2026;
        carro2.model = "Corolla";

        System.out.println(carro1.brand);
        System.out.println(carro1.model);
        System.out.println(carro1.year);
        System.out.println();

        System.out.println(carro2.brand);
        System.out.println(carro2.model);
        System.out.println(carro2.year);
    }
}