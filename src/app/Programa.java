package app;

import java.util.Locale;
import java.util.Scanner;

import entidades.ConversorMoeda;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
    
         System.out.println("Qual é o preço do dolar?: ");
         double precoDolar  = ler.nextDouble();
         
         System.out.println("Quantos dolares serao comprados?: ");
         double quantia = ler.nextDouble();
         
         double resultado = ConversorMoeda.dolarReal(quantia,precoDolar);
         System.out.printf("Valor a ser pago em reais: %.2f",resultado);
                
         ler.close();
         
    }

}
