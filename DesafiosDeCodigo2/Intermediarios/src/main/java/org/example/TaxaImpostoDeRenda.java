package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaxaImpostoDeRenda {
    public static void main(String[] args) throws IOException {

        boolean continuarCodigo = false;

        do {
            try{
                Scanner valorUsuario = new Scanner(System.in);
                double rendaUsuario = valorUsuario.nextDouble();
                double imposto;

                if (rendaUsuario <= 2000.00d){
                    System.out.println("Isento");
                    continuarCodigo = true;
                } else if (rendaUsuario <= 3000.00d) {
                    imposto = (rendaUsuario - 2000.00d) * 0.08;
                    System.out.println(String.format("R$ " + "%.2f", imposto));
                    continuarCodigo = true;
                } else if (rendaUsuario <= 4500.00d){
                    imposto = (rendaUsuario - 3000.00d) * 0.18 + 1000.00d * 0.08d;
                    System.out.println(String.format("R$ " + "%.2f", imposto));
                    continuarCodigo = true;
                } else if (rendaUsuario > 4500.00d) {
                    imposto = (rendaUsuario - 4500.00d) * 0.28d + 1000.00d * 0.08d + 1500.00d * 0.18d;
                    System.out.println(String.format("R$ " + "%.2f", imposto));
                    continuarCodigo = true;
                } else {
                    System.out.println("Ocorreu um erro inesperado! Tente novamente!");
                }
                valorUsuario.close();
            } catch (InputMismatchException err){
                System.out.println("Insira um valor válido!");
            }
        } while (continuarCodigo == false);
    }
}
