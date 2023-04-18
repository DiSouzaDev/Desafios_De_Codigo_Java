package org.example;

import java.util.*;

public class QuitandaSeuZe {
public static void main(String[] args) {

        boolean continuarCodigo = false;

        do {
                try{
                        Scanner valorUsuario = new Scanner(System.in);
                        int morangos = valorUsuario.nextInt();
                        int macas = valorUsuario.nextInt();
                        double precoMorango = 0d;
                        double precoMaca = 0d;

                        if (morangos >= 5 && macas >= 5){
                                precoMorango = 2.5d;
                                precoMaca = 1.8d;
                        } else if (morangos >= 5 && macas < 5){
                                precoMorango = 2.2d;
                                precoMaca = 1.8d;
                        } else if (morangos < 5 && macas >= 5) {
                                precoMorango = 2.5d;
                                precoMaca = 1.5d;
                        } else {
                                precoMorango = 2.5d;
                                precoMaca = 1.8d;
                        }

                        double valorTotal = (morangos * precoMorango) + (precoMaca * macas);

                        if (morangos + macas >= 8 || valorTotal >= 25d){
                                precoMorango = 2.5d;
                                precoMaca = 1.8d;

                                valorTotal = (morangos * precoMorango) + (precoMaca * macas);

                                valorTotal *= 0.9;
                        }

                        System.out.println(valorTotal);
                        continuarCodigo = true;
                        valorUsuario.close();
                } catch (InputMismatchException err){
                        System.out.println("Digite um valor válido!");
                }
        } while (continuarCodigo == false);
    }
}

