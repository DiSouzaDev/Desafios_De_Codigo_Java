package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {

        boolean continuarCodigo = false;

        do {
            try{
                Scanner leitor = new Scanner(System.in);
                double A = leitor.nextDouble();
                double B = leitor.nextDouble();
                double C = leitor.nextDouble();

                // Regras para a validação de um triângulo:
                // | b - c | < a < b + c
                // | a - c | < b < a + c
                // | a - b | < c < a + b
                boolean triangulo = (B - C < A && A < B + C) && (A - C < B && B < A + C) && (A - B < C && C < A + B) ? true : false;

                if (triangulo == true){
                    double perimetro = A + B + C;
                    System.out.println("Perímetro do triângulo: " + perimetro);
                    continuarCodigo = true;
                } else if (triangulo == false){
                    double area = ((A + B) * C) / 2;
                    System.out.println("Área do trapézio: " + area);
                    continuarCodigo = true;
                } else {
                    System.out.println("Ocorreu um erro inesperado! Tente novamente!");
                }
                leitor.close();
            } catch (InputMismatchException err){
                System.out.println("Insira um valor válido!");
            }
        } while (continuarCodigo == false);
    }
}