package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Objects;

public class Animal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuarCodigo = false;
        String AN1, AN2, AN3;
        AN1 = "";
        AN2 = "";
        AN3 = "";
        Map<Animais, String> listaAnimais = new HashMap<>(){{
            put(new Animais("vertebrado", "ave", "carnivoro"), "aguia");
            put(new Animais("vertebrado", "ave", "onivoro"), "pomba");
            put(new Animais("vertebrado", "mamifero", "onivoro"), "homem");
            put(new Animais("vertebrado", "mamifero", "herbivoro"), "vaca");
            put(new Animais("invertebrado", "inseto", "hematofago"), "pulga");
            put(new Animais("invertebrado", "inseto", "herbivoro"), "lagarta");
            put(new Animais("invertebrado", "anelideo", "hematofago"), "sanguessuga");
            put(new Animais("invertebrado", "anelideo", "onivoro"), "minhoca");
        }};

        do {
            System.out.println("-------------------------------------------------------------------\n" +
                    "Insira um de cada dos seguintes valores da sua escolha nessa ordem:\n" +
                    "Subgrupo: vertebrado ou invertebrado\n" +
                    "Espécie: ave, mamifero, inseto ou anelideo\n" +
                    "Alimentação: carnivoro, onivoro, herbivoro ou hematofago\n" +
                    "-------------------------------------------------------------------");
            AN1 = sc.nextLine();
            AN2 = sc.nextLine();
            AN3 = sc.nextLine();

            if (listaAnimais.containsKey(new Animais(AN1.trim(), AN2.trim(), AN3.trim()))) {
                continuarCodigo = true;
            } else {
                System.out.println("Valor(es) inserido(s) está(ão) incorreto(s)! Por favor, tente novamente.");
            }
        } while (continuarCodigo == false);

        System.out.println(listaAnimais.get(new Animais(AN1, AN2, AN3)));
    }
}
class Animais {
    String subgrupo;
    String especie;
    String alimentacao;

    public Animais(String subgrupo, String especie, String alimentacao) {
        this.subgrupo = subgrupo;
        this.especie = especie;
        this.alimentacao = alimentacao;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public String getEspecie() {
        return especie;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animais animais = (Animais) o;
        return Objects.equals(subgrupo, animais.subgrupo) && Objects.equals(especie, animais.especie) && Objects.equals(alimentacao, animais.alimentacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subgrupo, especie, alimentacao);
    }
}