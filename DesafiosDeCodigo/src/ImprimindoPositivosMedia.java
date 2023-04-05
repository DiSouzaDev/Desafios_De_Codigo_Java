import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ImprimindoPositivosMedia {

    public static void main(String[] args) throws IOException {

        boolean continueCodigo = false;

        do {
            try {
                Scanner leitor = new Scanner(System.in);
                int cont = 0;
                double media = 0;
                double valorUsuario;

                // TODO: Implemente as condições adequadas para obter a quantidade de valores
                // positivos e a média dos valores positivos:
                for (int x = 5; x >= 0; x--) {
                    valorUsuario = leitor.nextDouble();
                    if (valorUsuario > 0) {
                        cont++;
                        media += valorUsuario;
                    } else if (valorUsuario <= 0) {
                        System.out.println("Valor negativo ou neutro, portanto será desconsiderado");
                    } else {
                        System.out.println("Erro! Tente novamente");
                    }
                }

                media = media / cont;
                System.out.println(cont + " valores positivos");
                System.out.println(String.format("%.1f", media));
                continueCodigo = true;
                leitor.close();
            } catch (InputMismatchException err) {
                System.out.println("Erro! O valor digitado não é válido. Tente novamente!");
            }

        } while (continueCodigo == false);
    }
}