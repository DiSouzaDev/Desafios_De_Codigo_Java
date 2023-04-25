//Método para resolver o desafio de código: AnimaL. Ele não é válido, pois falha no teste fechado 6 (desconheço o motivo).
//Vi que usar ifs não era o objetivo do desafio, então testei um novo e nomei de Animal, mas vou deixar este como um demontrativo.

package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnimalTeste {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String valorInvalido = "Algum valor está inválido, tente novamente!";
        String AN1, AN2, AN3, resposta;
        boolean continuarLooping = false;

        // Carnivoro - águia
        // Onivoro - Pomba, homem, minhoca
        // Herbivoro - Vaca, Lagarta
        // Hematofago - Pulga, Sanguessuga

        do {
            try {
                AN1 = sc.nextLine();
                AN2 = sc.nextLine();
                AN3 = sc.nextLine();

                if (AN1.equals("vertebrado")) {
                    if (AN2.equals("ave")) {
                        if (AN3.equals("carnivoro")) {
                            resposta = "aguia";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else if (AN3.equals("onivoro")) {
                            resposta = "pomba";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else {
                            System.out.println(valorInvalido);
                        }
                    } else if (AN2.equals("mamifero")) {
                        if (AN3.equals("onivoro")) {
                            resposta = "homem";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else if (AN2.equals("herbivoro")) {
                            resposta = "vaca";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else {
                            System.out.println(valorInvalido);
                        }
                    }
                } else if (AN1.equals("invertebrado")) {
                    if (AN2.equals("inseto")) {
                        if (AN3.equals("hematofago")) {
                            resposta = "pulga";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else if (AN3.equals("herbivoro")) {
                            resposta = "lagarta";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else {
                            System.out.println(valorInvalido);
                        }
                    } else if (AN2.equals("anelideo")) {
                        if (AN3.equals("hematofago")) {
                            resposta = "sanguessuga";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else if (AN2.equals("onivoro")) {
                            resposta = "minhoca";
                            System.out.println(resposta);
                            continuarLooping = true;
                        } else {
                            System.out.println(valorInvalido);
                        }
                    } else {
                        System.out.println(valorInvalido);
                    }
                } else {
                    System.out.println(valorInvalido);
                }
            } catch (InputMismatchException err) {
                System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            }
        } while (continuarLooping == false);
        // TODO: Implemente as condição necessária para que seja verificado que tipo de
        // animal é:
        // Dica: Você pode utilizar o método equals para realizar comparações.
    }
}