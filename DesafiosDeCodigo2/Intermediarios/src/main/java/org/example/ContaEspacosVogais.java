package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaEspacosVogais {

    public static void main(String[] args) {

        Scanner valorUsuario = new Scanner(System.in);
        int espacosEmBranco = 0;
        int vogais = 0;
        boolean continuarCodigo = false;

        do{
            try{
                System.out.print("Digite o texto a ser analisado: ");
                String texto = valorUsuario.nextLine();

                for (int i = 0; i < texto.length(); i++) {
                    char c = texto.charAt(i);
                    if (c == ' ') {
                        espacosEmBranco++;
                        continuarCodigo = true;
                    } else if ("aeiouAEIOU".indexOf(c) != -1) {
                        vogais++;
                        continuarCodigo = true;
                    }
                }
            } catch (InputMismatchException err){
                System.out.println("Por favor, coloque um valor!");
            }
        } while (continuarCodigo == false);

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + vogais);
        valorUsuario.close();
    }
}